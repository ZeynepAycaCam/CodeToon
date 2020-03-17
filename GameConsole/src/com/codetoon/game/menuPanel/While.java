package com.codetoon.game.menuPanel;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.TextArea;
import java.awt.Color;

/**
 * Create class for tutorial of do and while statement
 * @author: Group 2D
 */
public class While extends JPanel {

	/***************constructor********************/
	public While() {
		
		//set layout
		setLayout(null);

		// set label for do and while statement tutorial and define size of label
		JLabel lblNewLabel = new JLabel("While and Do While Statements");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel.setBounds(398, 0, 396, 36);
		add(lblNewLabel);

		// set information about do and while statement and set font, type for text area
		TextArea textArea = new TextArea();
		textArea.setBackground(Color.WHITE);
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textArea.setEditable(false);
		textArea.setText("The while and do-while Statements\r\nThe while statement continually executes a block of statements while a particular condition is true. Its syntax can be expressed as:\r\nwhile (expression) {\r\n     statement(s)\r\n}\r\nThe while statement evaluates expression, which must return a boolean value. If the expression evaluates to true, the while statement executes the statement(s) in the while block. \r\nThe while statement continues testing the expression and executing its block until the expression evaluates to false. Using the while statement to print the \r\nvalues from 1 through 10 can be accomplished as in the following WhileDemo program:\r\n\r\nclass WhileDemo {\r\n    public static void main(String[] args){\r\n        int count = 1;\r\n        while (count < 11) {\r\n            System.out.println(\"Count is: \" + count);\r\n            count++;\r\n        }\r\n    }\r\n}\r\nYou can implement an infinite loop using the while statement as follows:\r\nwhile (true){\r\n    // your code goes here\r\n}\r\nThe Java programming language also provides a do-while statement, which can be expressed as follows:\r\ndo {\r\n     statement(s)\r\n} while (expression);\r\nThe difference between do-while and while is that do-while evaluates its expression at the bottom of the loop instead of the top.\r\n Therefore, the statements within the do block are always executed at least once, as shown in the following DoWhileDemo program:\r\n\r\nclass DoWhileDemo {\r\n    public static void main(String[] args){\r\n        int count = 1;\r\n        do {\r\n            System.out.println(\"Count is: \" + count);\r\n            count++;\r\n        } while (count < 11);\r\n    }\r\n}\r\n");
		textArea.setBounds(20, 40, 1170, 650);
		add(textArea);

	}
}