
package com.codetoon.game.objects;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.LinkedList;

import com.codetoon.game.console.Game;
import com.codetoon.game.framework.GameObject;
import com.codetoon.game.framework.ObjectId;
import com.codetoon.game.framework.Texture;

/**
 * Flag Class - Creates the connection between levels
 * 
 * @author 2D
 */
public class Flag extends GameObject {

	Texture tex = Game.getInstance(); // Instance of texture class for the
	// picture of the block

	public Flag(float x, float y, ObjectId id) {
		super(x, y, id); // Initializes a GameObject
	}

	/**
	 * 
	 */
	public void tick(LinkedList<GameObject> object) {
	}

	/**
	 * This method draws the flag images in the game
	 * 
	 * @param g
	 *            the Graphics object
	 */
	public void render(Graphics g) {
		g.drawImage(tex.flag, (int) x, (int) y, null);
	}

	/**
	 * This method gets the boundaries of a flag
	 */
	public Rectangle getBounds() {
		return new Rectangle((int) x, (int) y, 50, 80);
	}

}