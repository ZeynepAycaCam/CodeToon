package com.codetoon.game.console;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.LinkedList;

import javax.swing.JOptionPane;

import com.codetoon.game.framework.GameObject;
import com.codetoon.game.framework.ObjectId;
import com.codetoon.game.objects.Block;
import com.codetoon.game.objects.Flag;
import com.codetoon.game.objects.Player;

/**
 * Handler Class - adds, removes and loads textures of new objects
 * 
 * @author 2D
 *
 */
public class Handler {

	public LinkedList<GameObject> object = new LinkedList<GameObject>(); // List
																			// of
																			// all
																			// objects
																			// in
																			// the
																			// game

	private GameObject tempObject; // Any object
	private Camera cam;
	private BufferedImage level2 = null, level3 = null; // Level images
	private Game game; // The actual game

	public Handler(Camera cam) {

		this.cam = cam;

		// Initializing following levels
		BufferedImageLoader loader = new BufferedImageLoader();
		level2 = loader.loadImage("/level2.png");
		level3 = loader.loadImage("/level3.png");
	}

	/**
	 * This method loads the map of each level
	 * 
	 * @param image
	 *            that consists of a map draft
	 */
	public void LoadImageLevel(BufferedImage image) {

		// Size of the maps are initialized
		int w = image.getWidth();
		int h = image.getHeight();

		// Each block is scanned through to find types of objects and initialize
		// them for the map
		for (int xx = 0; xx < h; xx++) {
			for (int yy = 0; yy < w; yy++) {
				int pixel = image.getRGB(xx, yy);
				int red = (pixel >> 16) & 0xff;
				int green = (pixel >> 8) & 0xff;
				int blue = (pixel) & 0xff;

				// Sea block
				if (red == 0 && green == 255 && blue == 255)
					addObject(new Block(xx * 20, yy * 20, -1, ObjectId.Block, this));
				// Dirt block
				if (red == 255 && green == 255 && blue == 255)
					addObject(new Block(xx * 20, yy * 20, 0, ObjectId.Block, this));
				// Grass Block
				if (red == 128 && green == 128 && blue == 128)
					addObject(new Block(xx * 20, yy * 20, 1, ObjectId.Block, this));
				// Fire block
				if (red == 255 && green == 106 && blue == 0)
					addObject(new Block(xx * 20, yy * 20, 2, ObjectId.Block, this));
				// Hedgehog
				if (red == 255 && green == 0 && blue == 110)
					addObject(new Block(xx * 20, yy * 20, 3, ObjectId.Block, this));
				// Bear
				if (red == 178 && green == 0 && blue == 255)
					addObject(new Block(xx * 20, yy * 20, 5, ObjectId.Block, this));
				// Cactus
				if (red == 38 && green == 127 && blue == 0)
					addObject(new Block(xx * 20, yy * 20, 6, ObjectId.Block, this));
				// Snake
				if (red == 255 && green == 0 && blue == 0)
					addObject(new Block(xx * 20, yy * 20, 7, ObjectId.Block, this));
				// Dolphin
				if (red == 0 && green == 0 && blue == 110)
					addObject(new Block(xx * 20, yy * 20, 8, ObjectId.Block, this));

				// Player
				if (red == 0 && green == 0 && blue == 255)
					addObject(new Player(xx * 20, yy * 20, this, cam, ObjectId.Player));
				// Flag
				if (red == 255 && green == 216 && blue == 0)
					addObject(new Flag(xx * 20, yy * 20, ObjectId.Flag));
			}
		}
	}

	/**
	 * This method switches between maps of the levels
	 */
	public void switchLevel() {

		// Corresponding level is cleared
		clearLevel();

		// Camera settings are cleared
		cam.setX(0);

		switch (Game.LEVEL) {
		case 1:
			// Finishing message is shown and next level is loaded
			JOptionPane.showMessageDialog(game, "Level 1 Complete");
			LoadImageLevel(level2);
			break;
		case 2:
			// Finishing message is shown and next level is loaded
			JOptionPane.showMessageDialog(game, "Level 2 Complete");
			LoadImageLevel(level3);
			break;
		case 3:
			// Finishing message is shown and the game is ended
			JOptionPane.showMessageDialog(game, "YOU WIN");
			System.exit(0);
			break;
		}
		Game.LEVEL++;
	}

	/**
	 * This method removes the objects passed to it
	 */
	private void clearLevel() {
		object.clear();
	}

	/**
	 * This method scans every block in the game
	 */
	public void tick() {
		for (int i = 0; i < object.size(); i++) {

			tempObject = object.get(i);
			tempObject.tick(object);
		}
	}

	/**
	 * This method loads every block in the game
	 * 
	 * @param g
	 *            the graphics object
	 */
	public void render(Graphics g) {
		for (int i = 0; i < object.size(); i++) {
			tempObject = object.get(i);

			tempObject.render(g);
		}
	}

	/**
	 * Adds the parameter to the level
	 * 
	 * @param object
	 *            a GameObject object ( a block )
	 */
	public void addObject(GameObject object) {
		this.object.add(object);
	}

	/**
	 * Removes the parameter from the level
	 * 
	 * @param object
	 *            a GameObject object ( a block )
	 */
	public void removeObject(GameObject object) {
		this.object.remove(object);
	}

}