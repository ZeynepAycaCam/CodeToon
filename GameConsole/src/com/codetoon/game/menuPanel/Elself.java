package com.codetoon.game.menuPanel;

import javax.swing.JPanel;
import java.awt.TextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

/**
 * Create class information for if/else statement tutorial panel
 * @author: Group 2D
 */
public class Elself extends JPanel {

	public Elself() {
		
		//set layout
		setLayout(null);

		// set information about if/else statement and set font, type for text area
		TextArea textArea = new TextArea();
		textArea.setBackground(Color.WHITE);
		textArea.setEditable(false);
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textArea.setText("The if-then Statement\r\n\r\nThe if-then statement is the most basic of all the control flow statements. It tells your program to execute a certain section of code only if a particular test evaluates to true. For example, the Bicycle class could allow the brakes to decrease the bicycle's speed only if the bicycle is already in motion. One possible implementation of the applyBrakes method could be as follows:\r\nvoid applyBrakes() {\r\n    // the \"if\" clause: bicycle must be moving\r\n    if (isMoving){ \r\n        // the \"then\" clause: decrease current speed\r\n        currentSpeed--;\r\n    }\r\n}\r\n\r\nIf this test evaluates to false (meaning that the bicycle is not in motion), control jumps to the end of the if-then statement.\r\n\r\nIn addition, the opening and closing braces are optional, provided that the \"then\" clause contains only one statement:\r\nvoid applyBrakes() {\r\n    // same as above, but without braces \r\n    if (isMoving)\r\n        currentSpeed--;\r\n}\r\n\r\nDeciding when to omit the braces is a matter of personal taste. Omitting them can make the code more brittle. If a second statement is later added to the \"then\" clause, a common mistake would be forgetting to add the newly required braces. The compiler cannot catch this sort of error; you'll just get the wrong results.\r\n\r\nThe if-then-else Statement\r\n\r\nThe if-then-else statement provides a secondary path of execution when an \"if\" clause evaluates to false. You could use an if-then-else statement in the applyBrakes method to take some action if the brakes are applied when the bicycle is not in motion. In this case, the action is to simply print an error message stating that the bicycle has already stopped.\r\nvoid applyBrakes() {\r\n    if (isMoving) {\r\n        currentSpeed--;\r\n    } else {\r\n        System.err.println(\"The bicycle has already stopped!\");\r\n    } \r\n}\r\n\r\nclass IfElseDemo {\r\n    public static void main(String[] args) {\r\n\r\n        int testscore = 76;\r\n        char grade;\r\n\r\n        if (testscore >= 90) {\r\n            grade = 'A';\r\n        } else if (testscore >= 80) {\r\n            grade = 'B';\r\n        } else if (testscore >= 70) {\r\n            grade = 'C';\r\n        } else if (testscore >= 60) {\r\n            grade = 'D';\r\n        } else {\r\n            grade = 'F';\r\n        }\r\n        System.out.println(\"Grade = \" + grade);\r\n    }\r\n}\r\n\r\nThe output from the program is:\r\n    Grade = C\r\n\r\n");

		textArea.setBounds(20, 40, 1170, 650);
		add(textArea);

		// set label for if and else statement tutorial and define the size, font
		JLabel lblThe = new JLabel("The if-then and if-then-else Statements");
		lblThe.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblThe.setBounds(363, 11, 488, 22);
		add(lblThe);

	}

}