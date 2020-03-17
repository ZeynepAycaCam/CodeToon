package com.codetoon.game.menuPanel;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import com.codetoon.game.compiler.CodePanel;
import com.codetoon.game.console.Game;
import com.codetoon.game.console.GamePanel;

/**
 * Create frame and add all panel to display game and menu panel
 * @author: Group 2D
 */
public class DisplayGame {

	static JFrame frame; // frame for add panels and show them
	static Game game; // create game panel in order to add frame
	static CodePanel codepanel; // create code panel in order to add frame
	static GamePanel gamepanel; // create gamepanel panel in order to add codepanel and game into it
	static TutorialPanel tut; // create tutorial panel in order to add frame
	static Menu menu; // create menu panel for reaching it's properties

	public static void main(String[] args) {
		
		frame = new JFrame();
		tut = new TutorialPanel();
		
		//addActionListener to menu's new game button
		Menu.btnNewButton.addActionListener(new MyActionListener()); 
		frame.add(tut);
		
		// set frame's properties, size and visibility
		frame.setPreferredSize(new Dimension(1200, 725));
		frame.pack();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	/***********************************inner class*******************************/
	//create our actionlistener in order to create game panel when press new game button in menu 
	public static class MyActionListener implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			
			// if action is press the new game button make tutorial invisible and game panel visible
			if (event.getSource() == Menu.btnNewButton) { 
				tut.setVisible(false);
				game = new Game();
				codepanel = new CodePanel();
				gamepanel = new GamePanel(game, codepanel);
				gamepanel.setVisible(true);
				frame.add(gamepanel);

			}

		}

	}
}