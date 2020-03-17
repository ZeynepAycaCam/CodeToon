
package com.codetoon.game.framework;

import java.awt.*;

import java.util.LinkedList;

/**
 * GameObject Class - the abstract class connecting all the objects in the game
 * 
 * @author 2D
 *
 */
public abstract class GameObject {

	protected float x; // Coordinates of the objects
	protected float y;
	protected ObjectId id;
	protected float velX = 0; // Velocity of the objects
	protected float velY = 0;
	protected boolean falling = true;
	protected boolean jumping = false;

	public GameObject(float x, float y, ObjectId id) {
		this.x = x;
		this.y = y;
		this.id = id;
	}

	/**
	 * This method checks the movement of falling of an objects
	 * 
	 * @return true if the object is falling
	 */
	public boolean isFalling() {
		return falling;
	}

	/**
	 * This method set the movement of falling of an objects
	 * 
	 * @param falling
	 *            the situation of falling
	 */
	public void setFalling(boolean falling) {
		this.falling = falling;
	}

	/**
	 * This method checks the movement of jumping of an objects
	 * 
	 * @return true if the object is jumping
	 */
	public boolean isJumping() {
		return jumping;
	}

	/**
	 * This method set the movement of jumping of an objects
	 * 
	 * @param jumping
	 *            the situation of jumping
	 */
	public void setJumping(boolean jumping) {
		this.jumping = jumping;
	}

	/**
	 * This method goes through every object in the game
	 * 
	 * @param object
	 *            list of all the objects
	 */
	public abstract void tick(LinkedList<GameObject> object);

	/**
	 * This method draws every object in the game
	 * 
	 * @param g
	 *            the graphics object
	 */
	public abstract void render(Graphics g);

	/**
	 * This method gets the boundaries of an object as a rectangle
	 * 
	 * @return Rectangle the bounds
	 */
	public abstract Rectangle getBounds();

	/**
	 * This method return the x coordinate of an object
	 * 
	 * @return x the coordinate
	 */
	public float getX() {
		return x;
	}

	/**
	 * This method return the y coordinate of an object
	 * 
	 * @return y the coordinate
	 */
	public float getY() {
		return y;
	}

	/**
	 * This method sets the x coordinate of an object
	 */
	public void setX(float x) {
		this.x = x;
	}

	/**
	 * This method sets the y coordinate of an object
	 */
	public void setY(float y) {
		this.y = y;
	}

	/**
	 * This method returns the horizontal velocity of an object
	 * 
	 * @return velX horizontal velocity
	 */
	public float getVelX() {
		return velX;
	}

	/**
	 * This method returns the vertical velocity of an object
	 * 
	 * @return velY vertical velocity
	 */
	public float getVelY() {
		return velY;
	}

	/**
	 * This method sets the horizontal velocity of an object
	 */
	public void setVelX(float velX) {
		this.velX = velX;
	}

	/**
	 * This method sets the vertical velocity of an object
	 */
	public void setVelY(float velY) {
		this.velY = velY;
	}

	/**
	 * This method returns the Id of an object
	 * 
	 * @return id
	 */
	public ObjectId getId() {
		return id; // Check what the object is
	}

}