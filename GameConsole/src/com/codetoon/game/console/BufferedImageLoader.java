package com.codetoon.game.console;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * BufferedImgeLoader - catches the exceptions when an image is loaded
 * 
 * @author 2D
 *
 */
public class BufferedImageLoader {
	private BufferedImage image; // Any buffered image

	/**
	 * This method takes a path of an image and loads it
	 * 
	 * @param path
	 *            the folder path of an image
	 * @return image the loaded image
	 */
	public BufferedImage loadImage(String path) {
		try {
			image = ImageIO.read(getClass().getResource(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return image;
	}

}