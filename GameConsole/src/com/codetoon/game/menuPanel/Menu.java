package com.codetoon.game.menuPanel;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

/**
 * Create panel to hold menu components
 * @author: Group 2D
 */
public class Menu extends JPanel {

	public static JButton btnNewButton; // new gaame button
	JPanel panel; // panel for add menu component
	
	/***************constructor********************/
	public Menu() {
		
        // set panel size, color and layout
		setBackground(Color.BLUE);
		setPreferredSize(new Dimension(1200, 700));
		setMaximumSize(new Dimension(1200, 700));
		setMinimumSize(new Dimension(1200, 700));
		setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		setLayout(null);

		// add label for menu panel, set size,font
		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setBounds(586, 95, 476, 129);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 41));
		add(lblNewLabel);
        
		//add button for providing to enter new game 
		btnNewButton = new JButton("New Game");
		btnNewButton.setBounds(539, 243, 247, 51);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 35));
		add(btnNewButton);

		// add background icon
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Zeynep\\Desktop\\GameConsole\\CodeToon.jpg"));
		lblNewLabel_1.setBounds(5, 5, 1190, 690);
		add(lblNewLabel_1);

		setVisible(true);

	}

	@Override
	/*
	 * override of getPrefferredSize()
	 * @return Dimension of panel
	 * 
	 */
	public Dimension getPreferredSize() {
		return (new Dimension(1150, 650));
	}
}
