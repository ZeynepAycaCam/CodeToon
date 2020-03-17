package com.codetoon.game.menuPanel;

import javax.swing.JPanel;
import java.awt.TextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

/**
 * Create class information for "for" tutorial panel
 * @author: Group 2D
 */
public class For extends JPanel {

	public For() {
		
		// set layout
		setLayout(null);

		// set information about for statement and set font, type for text area
		TextArea textArea = new TextArea();
		textArea.setBackground(Color.WHITE);
		textArea.setEditable(false);
		textArea.setText("The for statement provides a compact way to iterate over a range of values. Programmers often refer to it as the \"for loop\" because of the way in which it repeatedly loops until a particular condition is satisfied. The general form of the for statement can be expressed as follows:\r\nfor (initialization; termination;\r\n     increment) {\r\n    statement(s)\r\n}\r\n\r\nWhen using this version of the for statement, keep in mind that:\r\nThe initialization expression initializes the loop; it's executed once, as the loop begins. \r\nWhen the termination expression evaluates to false, the loop terminates. \r\nThe increment expression is invoked after each iteration through the loop; it is perfectly acceptable for this expression to increment or decrement a value. \r\n\r\nThe following program, ForDemo, uses the general form of the for statement to print the numbers 1 through 10 to standard output:\r\nclass ForDemo {\r\n    public static void main(String[] args){\r\n         for(int i=1; i<11; i++){\r\n              System.out.println(\"Count is: \" + i);\r\n         }\r\n    }\r\n}\r\n\r\nThe output of this program is:\r\nCount is: 1\r\nCount is: 2\r\nCount is: 3\r\nCount is: 4\r\nCount is: 5\r\nCount is: 6\r\nCount is: 7\r\nCount is: 8\r\nCount is: 9\r\nCount is: 10\r\n\r\nNotice how the code declares a variable within the initialization expression. The scope of this variable extends from its declaration to the end of the block governed by the for statement, so it can be used in the termination and increment expressions as well. If the variable that controls a for statement is not needed outside of the loop, it's best to declare the variable in the initialization expression. The names i, j, and k are often used to control for loops; declaring them within the initialization expression limits their life span and reduces errors.\r\n\r\nThe three expressions of the for loop are optional; an infinite loop can be created as follows:\r\n// infinite loop\r\nfor ( ; ; ) {\r\n    \r\n    // your code goes here\r\n}\r\n\r\nThe for statement also has another form designed for iteration through Collections and arrays This form is sometimes referred to as the enhanced for statement, and can be used to make your loops more compact and easy to read. To demonstrate, consider the following array, which holds the numbers 1 through 10:\r\n\r\nint[] numbers = {1,2,3,4,5,6,7,8,9,10};\r\nThe following program, EnhancedForDemo, uses the enhanced for to loop through the array:\r\nclass EnhancedForDemo {\r\n    public static void main(String[] args){\r\n         int[] numbers = \r\n             {1,2,3,4,5,6,7,8,9,10};\r\n         for (int item : numbers) {\r\n             System.out.println(\"Count is: \" + item);\r\n         }\r\n    }\r\n}\r\n\r\nIn this example, the variable item holds the current value from the numbers array. The output from this program is the same as before:\r\nCount is: 1\r\nCount is: 2\r\nCount is: 3\r\nCount is: 4\r\nCount is: 5\r\nCount is: 6\r\nCount is: 7\r\nCount is: 8\r\nCount is: 9\r\nCount is: 10\r\nWe recommend using this form of the for statement instead of the general form whenever possible.\r\n");
		textArea.setBounds(20, 40, 1170, 650);
		add(textArea);

		// set label for "for" statement tutorial and define the size, font
		JLabel lblTheForStatement = new JLabel("The For Statement");
		lblTheForStatement.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblTheForStatement.setBounds(504, 11, 245, 24);
		add(lblTheForStatement);

	}

}