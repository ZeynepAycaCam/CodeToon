
package com.codetoon.game.objects;

import java.awt.*;
import java.util.LinkedList;

import com.codetoon.game.console.Game;
import com.codetoon.game.console.Handler;
import com.codetoon.game.framework.GameObject;
import com.codetoon.game.framework.ObjectId;
import com.codetoon.game.framework.Texture;

/** Block Class - This class creates and initializes blocks in the game
 * @author 2D
 */
public class Block extends GameObject {

	// Properties
	Texture tex = Game.getInstance(); // Instance of texture class for the
										// pictures of blocks
	private int type; // Types of the blocks

	// Constructor
	public Block(float x, float y, int type, ObjectId id, Handler handler) {
		// Initializes the GameObject class
		super(x, y, id);
		this.type = type;
	}

	/**
	 * 
	 * @see com.codetoon.game.framework.GameObject#tick(java.util.LinkedList)
	 */
	public void tick(LinkedList<GameObject> object) {
	}

	/**
	 * This method draws the blocks for each type
	 * 
	 * @param g Graphics objects
	 */
	public void render(Graphics g) {

		//These lods the specific texture for a type of a block
		if (type == -1) { // Sea Block
			g.drawImage(tex.sea, (int) x, (int) y, null);
		}
		if (type == 0) { // Dirt Block
			g.drawImage(tex.dirt, (int) x, (int) y, null);
		}
		if (type == 1) { // Grass Block
			g.drawImage(tex.grass, (int) x, (int) y, null);
		}
		if (type == 2) { // Fire block
			g.drawImage(tex.fire, (int) x, (int) y, null);
		}
		if (type == 3) { // Hedgehog Block
			g.drawImage(tex.hedgehog, (int) x, (int) y, null);
		}
		if (type == 5) { // Bear Block
			g.drawImage(tex.bear, (int) x, (int) y, null);
		}
		if (type == 6) { // Cactus Block
			g.drawImage(tex.cactus, (int) x, (int) y, null);
		}
		if (type == 7) { // Snake Block
			g.drawImage(tex.snake, (int) x, (int) y, null);
		}
		if (type == 8) { // Dolphin Block
			g.drawImage(tex.dolphin, (int) x, (int) y, null);
		}
	}

	/**
	 * This method returns the type of the blocks
	 * 
	 * @return type
	 */
	public int getType() {
		return type;
	}

	/**
	 * This method returns the bounds of a block
	 * 
	 * @return rectangle
	 */
	public Rectangle getBounds() {
		
		//These determine the boundaries of blocks
		if (type == 2) { // Fire Block
			return new Rectangle((int) x, (int) y, 30, 60);
		}
		if (type == 3) { // Hedgehog
			return new Rectangle((int) x, (int) y, 80, 40);
		}
		if (type == 5) { // Bear
			return new Rectangle((int) x, (int) y, 80, 40);
		}
		if (type == 6) { // Cactus
			return new Rectangle((int) x, (int) y, 90, 120);
		}
		if (type == 7) { // Snake
			return new Rectangle((int) x, (int) y, 60, 80);
		}
		// Other types
		return new Rectangle((int) x, (int) y, 20, 20);
	}

}