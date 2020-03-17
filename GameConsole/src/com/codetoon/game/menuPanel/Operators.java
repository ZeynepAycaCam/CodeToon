package com.codetoon.game.menuPanel;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.TextArea;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;

/**
 * Create class information for operator tutorial panel
 * @author: Group 2D
 */
public class Operators extends JPanel {
	
	/***************constructor********************/
	public Operators() {
		
		//set layout
		setLayout(null);

		// set information for operators tutorial and set font, type for text area
		TextArea textArea = new TextArea();
		textArea.setBackground(Color.WHITE);
		textArea.setEditable(false);
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textArea.setText("Simple Assignment Operator\r\n=       Simple assignment operator\r\n\r\nArithmetic Operators\r\n+       Additive operator (also used\r\n        for String concatenation)\r\n-       Subtraction operator\r\n*       Multiplication operator\r\n/       Division operator\r\n%       Remainder operator\r\n\r\nUnary Operators\r\n+       Unary plus operator; indicates\r\n        positive value (numbers are \r\n        positive without this, however)\r\n-       Unary minus operator; negates\r\n        an expression\r\n++      Increment operator; increments\r\n        a value by 1\r\n--      Decrement operator; decrements\r\n        a value by 1\r\n!       Logical complement operator;\r\n        inverts the value of a boolean\r\n\r\nEquality and Relational Operators\r\n==      Equal to\r\n!=      Not equal to\r\n>       Greater than\r\n>=      Greater than or equal to\r\n<       Less than\r\n<=      Less than or equal to\r\n\r\nConditional Operators\r\n&&      Conditional-AND\r\n||      Conditional-OR\r\n?:      Ternary (shorthand for \r\n        if-then-else statement)\r\n\r\nType Comparison Operator instanceof   Compares an object to a specified type \r\n");
		textArea.setBounds(20, 40, 1170, 650);
		add(textArea);

		// set label for operators tutorial and define size of label
		JLabel lblOperators = new JLabel("Operators");
		lblOperators.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblOperators.setBounds(544, 0, 133, 28);
		add(lblOperators);

	}
}
