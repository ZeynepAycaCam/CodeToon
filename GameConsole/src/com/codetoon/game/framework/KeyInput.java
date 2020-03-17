package com.codetoon.game.framework;

import java.awt.event.*;
import com.codetoon.game.console.Handler;
import com.codetoon.game.compiler.CodePanel;
import com.codetoon.game.objects.*;

/**
 * KeyInput Class - Connects the keyboard to the game
 * @author 2D
 *
 */
public class KeyInput extends KeyAdapter {

	// PROPERTIES
	Handler handler;
	CodePanel panel;

	public KeyInput(Handler handler, CodePanel panel) {
		this.handler = handler;
		this.panel = panel;
	}

	/**
	 * This method understands if a key input is taken and makes the player move
	 * 
	 * @param e
	 *            the key event
	 */
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		// Searching all objects
		for (int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);

			// The player is found
			if (tempObject.getId() == ObjectId.Player) {

				// If the user is not around an obstacle all the keys can be
				// used
				if (!((Player) tempObject).isBlock() && !panel.getTrueAnswer()) {

					panel.setTrueAnswer(false);

					if (key == KeyEvent.VK_RIGHT)
						tempObject.setVelX(5);
					if (key == KeyEvent.VK_LEFT)
						tempObject.setVelX(-5);
					if (key == KeyEvent.VK_UP && !tempObject.isJumping()) {
						tempObject.setJumping(true);
						tempObject.setVelY(-5);
					}
					if (key == KeyEvent.VK_SPACE && !tempObject.isJumping()) {
						tempObject.setJumping(true);
						tempObject.setVelY(-5);
					}
					if (key == KeyEvent.VK_DOWN)
						tempObject.setVelY(5);
				}
				// If the user comes close to an obstacle for the first time,
				// the key input is disabled
				else if (((Player) tempObject).isBlock() && !panel.getTrueAnswer()) {
				}
				// If the user answers the question in the answer correctly, key
				// input is again enabled
				else if (((Player) tempObject).isBlock() && panel.getTrueAnswer()) {

					if (key == KeyEvent.VK_RIGHT)
						tempObject.setVelX(5);
					if (key == KeyEvent.VK_LEFT)
						tempObject.setVelX(-5);
					if (key == KeyEvent.VK_UP && !tempObject.isJumping()) {
						tempObject.setJumping(true);
						tempObject.setVelY(-5);
					}
					if (key == KeyEvent.VK_SPACE && !tempObject.isJumping()) {
						tempObject.setJumping(true);
						tempObject.setVelY(-5);
					}
					if (key == KeyEvent.VK_DOWN)
						tempObject.setVelY(5);
				}

				// Solving the problem of answering the question without being
				// near to an obstacle
				else if (!((Player) tempObject).isBlock() && panel.getTrueAnswer()) {

					panel.setTrueAnswer(false);
				}

			}

		}
		// The game can be closed by esc key
		if (key == KeyEvent.VK_ESCAPE) {
			System.exit(1);
		}
	}

	/**
	 * This method stops the movement when the key input is disabled
	 * 
	 * @param e
	 *            the key event
	 */
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		for (int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);

			if (tempObject.getId() == ObjectId.Player) {
				if (key == KeyEvent.VK_RIGHT)
					tempObject.setVelX(0);
				if (key == KeyEvent.VK_LEFT)
					tempObject.setVelX(0);
				if (key == KeyEvent.VK_UP && !tempObject.isJumping()) {
					tempObject.setJumping(true);
					tempObject.setVelY(0);
				}
				if (key == KeyEvent.VK_SPACE && !tempObject.isJumping()) {
					tempObject.setJumping(true);
					tempObject.setVelY(0);
				}
				if (key == KeyEvent.VK_DOWN)
					tempObject.setVelY(0);
			}
		}
		if (key == KeyEvent.VK_ESCAPE) {
			System.exit(1);
		}

	}

}