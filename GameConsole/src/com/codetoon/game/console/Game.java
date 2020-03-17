package com.codetoon.game.console;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Random;

import com.codetoon.game.compiler.CodePanel;
import com.codetoon.game.framework.KeyInput;
import com.codetoon.game.framework.ObjectId;
import com.codetoon.game.framework.Texture;

/**
 * Game Class - creates and initializes a new game
 * 
 * @author 2D
 *
 */
public class Game extends Canvas implements Runnable, Serializable {

	private static final long serialVersionUID = -6393726036678177038L;

	// PROPERTIES
	private boolean running = false; // If the game is started
	private Thread thread;
	CodePanel panel = new CodePanel(); // The IDE part of the game

	public static int WIDTH, HEIGHT; // Sizes of the game
	public BufferedImage level = null, clouds = null; // Background images

	// Object
	Handler handler;
	Compiler compiler;
	Camera cam;
	static Texture tex;
	Random rand = new Random();

	public static int LEVEL = 1; // Starting level

	/**
	 * This method initializes a new Game Object
	 */
	private void init() {

		// Setting the sizes
		WIDTH = getWidth();
		HEIGHT = getHeight();

		// Setting the background images
		tex = new Texture();
		BufferedImageLoader loader = new BufferedImageLoader();
		level = loader.loadImage("/level1.png");
		clouds = loader.loadImage("/background.png");

		// Setting the camera
		cam = new Camera(0, 0);

		// Setting the handler an dthe keyListener
		handler = new Handler(cam);
		handler.LoadImageLevel(level);
		this.addKeyListener(new KeyInput(handler, panel));
	}

	/**
	 * This method starts the game
	 */
	public synchronized void start() {
		if (running) {
			return;
		}
		running = true;
		thread = new Thread(this);
		thread.start();
	}

	/**
	 * This method make the game work endlessly and with constant frames per
	 * second
	 */
	public void run() {

		init(); // Initialized

		this.requestFocus();
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int updates = 0;
		int frames = 0;
		while (running) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while (delta >= 1) {
				tick();
				updates++;
				delta--;
			}
			render();
			frames++;

			if (System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				// System.out.println("FPS: " + frames + " TICKS: " + updates);
				frames = 0;
				updates = 0;
			}
		}

	}

	/**
	 * This method scans through every object in the game and if it is playe
	 * associates the player with it
	 */
	private void tick() {
		handler.tick();
		for (int i = 0; i < handler.object.size(); i++) {
			if (handler.object.get(i).getId() == ObjectId.Player)
				cam.tick(handler.object.get(i));
		}

	}

	/**
	 * This method draws the game
	 */
	private void render() {

		BufferStrategy bs = this.getBufferStrategy();
		if (bs == null) {
			this.createBufferStrategy(3);
			return;
		}

		Graphics g = bs.getDrawGraphics();
		Graphics2D g2d = (Graphics2D) g;

		// Background is colored
		g.setColor(new Color(25, 191, 224));
		g.fillRect(0, 0, getWidth(), getHeight());

		// Cam is started
		g2d.translate(cam.getX(), cam.getY());

		// Clouds are added to the background
		for (int xx = 0; xx < clouds.getWidth() * 100; xx += clouds.getWidth()) {

			g.drawImage(clouds, xx, 25, this);
		}

		// Each object is drawen
		handler.render(g);

		// Camera is ended
		g2d.translate(-cam.getX(), -cam.getY());

		g.dispose();
		bs.show();

	}

	/**
	 * This method creates a instance of the texture class for easier use
	 * 
	 * @return tex an instance of the texture class
	 */
	public static Texture getInstance() {
		return tex;
	}

}