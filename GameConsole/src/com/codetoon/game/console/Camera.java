
package com.codetoon.game.console;

import com.codetoon.game.framework.GameObject;

/**
 * Camera Class - Camera that follows the character
 * 
 * @author 2D
 */

public class Camera {

	// Properties
	private float x, y; // Coordinates of the character

	// Constructor
	public Camera(float x, float y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * This method starts the camera where the character starts
	 * 
	 * @param player
	 *            the player to be followed
	 */
	public void tick(GameObject player) {
		x = -player.getX() + Game.WIDTH / 16;
	}

	/**
	 * This method changes the x of the camera with respect to the character
	 * 
	 * @param x
	 *            x coordinate of the character
	 */
	public void setX(float x) {
		this.x = x;
	}

	/**
	 * This method changes the y of the camera with respect to the character
	 * 
	 * @param y
	 *            y coordinate of the character
	 */
	public void setY(float y) {
		this.y = y;
	}

	/**
	 * This method get the x coordinate of the camera
	 * 
	 * @return x the x coordinate of the camera
	 */
	public float getX() {
		return x;
	}

	/**
	 * This method get the y coordinate of the camera
	 * 
	 * @return y the y coordinate of the camera
	 */
	public float getY() {
		return y;
	}
}