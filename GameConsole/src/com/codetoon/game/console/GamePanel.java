package com.codetoon.game.console;

import java.awt.*;
//import com.codetoon.game.menuPanel.Menu;

import javax.swing.*;

import com.codetoon.game.compiler.CodePanel;

/**
 * GamePanel is a panel to combine game and the CodePanel
 * @author Group2D
 */

public class GamePanel extends JPanel {
	private static final long serialVersionUID = 1L;
	Menu menu;

	// constructor
	public GamePanel(Game game, CodePanel compiler) {
		// Setting the game's size
		game.setPreferredSize(new Dimension(700, 750));
		game.setMaximumSize(new Dimension(700, 750));
		game.setMinimumSize(new Dimension(700, 750));

		// Setting the CodePanel's size
		compiler.setPreferredSize(new Dimension(500, 725));
		compiler.setMaximumSize(new Dimension(500, 725));
		compiler.setMinimumSize(new Dimension(500, 725));

		setLayout(new BorderLayout());// Setting Layout to BorderLayout to add to panel

		// adding the compiler to the east of the panel
		add(compiler, BorderLayout.EAST);
		// adding the game to the west of the panel
		add(game, BorderLayout.WEST);
		
		setVisible(true);

		game.start(); // starting game
	}

	public GamePanel() {
		// Empty constructor to use easily
		this(new Game(), new CodePanel());
	}



}