package com.codetoon.game.menuPanel;

import javax.swing.JPanel;
import java.awt.TextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

/**
 * Create class information for class tutorial panel
 * @author: Group 2D
 */
public class Classes extends JPanel {
	
	/***************constructor********************/
	public Classes() {
		// set layout
		setLayout(null);
		
		// set information about class and set font, type for text area
		TextArea textArea = new TextArea();
		textArea.setBackground(Color.WHITE);
		textArea.setEditable(false);
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textArea.setText("The introduction to object-oriented concepts in the lesson titled Object-oriented Programming Concepts used a bicycle class as an example, with racing bikes, mountain bikes, and tandem bikes as subclasses. Here is sample code for a possible implementation of a Bicycle class, to give you an overview of a class declaration. Subsequent sections of this lesson will back up and explain class declarations step by step. For the moment, don't concern yourself with the details.\r\n\r\npublic class Bicycle {\r\n        \r\n    // the Bicycle class has\r\n    // three fields\r\n    public int cadence;\r\n    public int gear;\r\n    public int speed;\r\n        \r\n    // the Bicycle class has\r\n    // one constructor\r\n    public Bicycle(int startCadence, int startSpeed, int startGear) {\r\n        gear = startGear;\r\n        cadence = startCadence;\r\n        speed = startSpeed;\r\n    }\r\n        \r\n    // the Bicycle class has\r\n    // four methods\r\n    public void setCadence(int newValue) {\r\n        cadence = newValue;\r\n    }\r\n        \r\n    public void setGear(int newValue) {\r\n        gear = newValue;\r\n    }\r\n        \r\n    public void applyBrake(int decrement) {\r\n        speed -= decrement;\r\n    }\r\n        \r\n    public void speedUp(int increment) {\r\n        speed += increment;\r\n    }\r\n        \r\n}\r\n\r\nA class declaration for a MountainBike class that is a subclass of Bicycle might look like this:\r\npublic class MountainBike extends Bicycle {\r\n        \r\n    // the MountainBike subclass has\r\n    // one field\r\n    public int seatHeight;\r\n\r\n    // the MountainBike subclass has\r\n    // one constructor\r\n    public MountainBike(int startHeight, int startCadence,\r\n                        int startSpeed, int startGear) {\r\n        super(startCadence, startSpeed, startGear);\r\n        seatHeight = startHeight;\r\n    }   \r\n        \r\n    // the MountainBike subclass has\r\n    // one method\r\n    public void setHeight(int newValue) {\r\n        seatHeight = newValue;\r\n    }   \r\n\r\n}\r\n\r\nMountainBike inherits all the fields and methods of Bicycle and adds the field seatHeight and a method to set it (mountain bikes have seats that can be moved up and down as the terrain demands).");
		textArea.setBounds(20, 40, 1170, 650);
		add(textArea);
		
		// set label for class tutorial and size of label
		JLabel lblClasses = new JLabel("Classes");
		lblClasses.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblClasses.setBounds(561, 11, 94, 21);
		add(lblClasses);

	}

}
