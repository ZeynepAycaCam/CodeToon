

package com.codetoon.game.framework;

import java.awt.image.BufferedImage;

import com.codetoon.game.console.BufferedImageLoader;

/**
 * Texture Class - Initializes the textures of all the objects
 * 
 * @author Ekin
 *
 */
public class Texture {

	// PROPERTIES

	// All the textures in the game
	public BufferedImage grass = null;
	public BufferedImage sea = null;
	public BufferedImage dirt = null;
	public BufferedImage player = null;
	public BufferedImage flag = null;
	public BufferedImage fire = null;
	public BufferedImage hedgehog = null;
	public BufferedImage bear = null;
	public BufferedImage cactus = null;
	public BufferedImage snake = null;
	public BufferedImage dolphin = null;

	public Texture() {
		this.getTextures();
	}

	/**
	 * This method loads all the textures in the game
	 */
	private void getTextures() {

		// Creating the instance of BufferedImageLoader class to load the
		// pictures
		BufferedImageLoader loader = new BufferedImageLoader();

		// All the textures are initialized and the exception is catched
		try {
			sea = loader.loadImage("/sea.png");
			grass = loader.loadImage("/grass.png");
			dirt = loader.loadImage("/dirt.png");
			player = loader.loadImage("/character.png");
			flag = loader.loadImage("/flag.png");
			fire = loader.loadImage("/fire.png");
			hedgehog = loader.loadImage("/hedgehog.png");
			bear = loader.loadImage("/bear.png");
			cactus = loader.loadImage("/cactus.png");
			snake = loader.loadImage("/snake.png");
			dolphin = loader.loadImage("/dolphin.png");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}