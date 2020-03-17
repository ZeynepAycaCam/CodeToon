
package com.codetoon.game.objects;

import java.awt.*;
import java.util.LinkedList;

import com.codetoon.game.console.Camera;
import com.codetoon.game.console.Game;
import com.codetoon.game.console.Handler;
import com.codetoon.game.framework.GameObject;
import com.codetoon.game.framework.ObjectId;
import com.codetoon.game.framework.Texture;

/**
 * Player Class - The main character class which determines the size, apperance
 * and movements of the characters
 * 
 * @author 2D
 *
 */
public class Player extends GameObject {

	private float width = 32, height = 120; // Sizes of the character
	private float gravity = 0.2f; // Gravity on the character
	private final float MAX_SPEED = 10;
	private Handler handler;
	Texture tex = Game.getInstance();// Instance of texture class for the
	// pictures of blocks

	public Player(float x, float y, Handler handler, Camera cam, ObjectId id) {
		super(x, y, id);
		this.handler = handler;
	}

	/**
	 * This method adds the gravity to the characters in case of jumping and
	 * falling
	 * 
	 * @param object
	 *            list of every character in the game
	 */
	public void tick(LinkedList<GameObject> object) {

		// Setting the velocity of falling
		x += velX;
		y += velY;

		// Disabling the velocity increase if it reaches a certain value
		if (falling || jumping) {
			velY += gravity;

			if (velY > MAX_SPEED) {
				velY = MAX_SPEED;
			}
		}
		// The gravity in disabled when the character comes across to another
		// block
		Collision(object);
	}

	/**
	 * This method make sures that the player cannot go inside another object
	 * and that collision exists
	 * 
	 * @param object
	 *            list of objects other than the player
	 */
	private void Collision(LinkedList<GameObject> object) {

		// Checking every block in the map until an obstacle is found
		for (int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);

			// When the player comes across an obstacle her velocity becomes
			// zero and the player and the obstacle cannot intersect
			if (tempObject.getId() == ObjectId.Block) {

				// Collision from top
				if (getBoundsTop().intersects(tempObject.getBounds())) {
					y = tempObject.getY() + height / 2;
					velY = 0;
				}

				if (getBounds().intersects(tempObject.getBounds())) {
					y = tempObject.getY() - height;
					velY = 0;
					falling = false;
					jumping = false;
				} else {
					falling = true;
				}

				// Collision from right
				if (getBoundsRight().intersects(tempObject.getBounds())) {
					x = tempObject.getX() - width - 2;
				}

				// Collision from left
				if (getBoundsLeft().intersects(tempObject.getBounds())) {
					x = tempObject.getX() + width - 10;
				}
			}
			// If the obstacle is a flag, levels are switched
			else if (tempObject.getId() == ObjectId.Flag) {
				if (getBounds().intersects(tempObject.getBounds())) {
					handler.switchLevel();
				}
			}
		}
	}

	/**
	 * This method draws the image of the player
	 * 
	 * @param g
	 *            Graphics g
	 */
	public void render(Graphics g) {
		g.drawImage(tex.player, (int) x, (int) y, null);
	}

	/**
	 * This method gets the bounds around the player
	 * 
	 * @return Rectangle of the bounds
	 */
	public Rectangle getBounds() {
		return new Rectangle((int) ((int) x + (width / 2) - (width / 2) / 2), (int) ((int) y + (height / 2)),
				(int) width / 2, (int) height / 2);
	}

	/**
	 * This method gets the bounds at the top of the player
	 * 
	 * @return Rectangle of the bounds
	 */
	public Rectangle getBoundsTop() {
		return new Rectangle((int) ((int) x + (width / 2) - (width / 2) / 2), (int) y, (int) width / 2,
				(int) height / 2);
	}

	/**
	 * This method gets the bounds at the right of the player
	 * 
	 * @return Rectangle of the bounds
	 */
	public Rectangle getBoundsRight() {
		return new Rectangle((int) ((int) x + width - 5), (int) y + 5, (int) 5, (int) height - 10);
	}

	/**
	 * This method gets the bounds at the left of the player
	 * 
	 * @return Rectangle of the bounds
	 */
	public Rectangle getBoundsLeft() {
		return new Rectangle((int) x, (int) y + 5, (int) 5, (int) height - 10);
	}

	/**
	 * This method checks if the player came across to an obstacle or the ground
	 * 
	 * @return true if the player is near an obstacle
	 */
	public boolean isBlock() {
		for (int i = 0; i < handler.object.size(); i++) {

			GameObject tempBlock = handler.object.get(i);
			if (tempBlock.getId() == ObjectId.Block && ((Block) tempBlock).getType() > 1) {
				if (this.x > (tempBlock.getX() - 100) && this.x < (tempBlock.getX() + 100)
						&& this.y < (tempBlock.getY()) - 50) {
					return true; // If the boundaries of the player overlaps the
									// boundaries of the obstacle than return
									// true
				}
			}
		}
		return false;
	}
}