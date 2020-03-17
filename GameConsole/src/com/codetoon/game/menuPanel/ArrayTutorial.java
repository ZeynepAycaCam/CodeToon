package com.codetoon.game.menuPanel;

import javax.swing.JPanel;
import java.awt.TextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

/**
 * Create array information for array tutorial panel
 * @author: Group 2D
 */
public class ArrayTutorial extends JPanel {

	/***************constructor********************/
	public ArrayTutorial() {

		// set panel Layout
		setLayout(null);

		// set information about array and set font, type
		TextArea textArea = new TextArea();
		textArea.setBackground(Color.WHITE);
		textArea.setEditable(false);
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textArea.setText("An array is a container object that holds a fixed number of values of a single type. The length of an array is established when the array is created. After creation, its length is fixed.\r\nIllustration of an array as 10 boxes numbered 0 through 9; an index of 0 indicates the first element in the array\r\nAn array of 10 elements.\r\n \r\nEach item in an array is called an element, and each element is accessed by its numerical index. As shown in the preceding illustration, numbering begins with 0. The 9th element, for example, would therefore be accessed at index 8.\r\nDeclaring a Variable to Refer to an Array\r\nThe preceding program declares an array (named anArray) with the following line of code:\r\n// declares an array of integers\r\nint[] anArray;\r\nLike declarations for variables of other types, an array declaration has two components: the array's type and the array's name. An array's type is written as type[], where type is the data type of the contained elements; the brackets are special symbols indicating that this variable holds an array.\r\nSimilarly, you can declare arrays of other types:\r\ndouble[] anArrayOfDoubles;\r\nboolean[] anArrayOfBooleans;\r\nchar[] anArrayOfChars;\r\nString[] anArrayOfStrings;\r\nCreating, Initializing, and Accessing an Array\r\nOne way to create an array is with the new operator. The next statement in the ArrayDemo program allocates an array with enough memory for 10 integer elements and assigns the array to the anArray variable.\r\n// create an array of integers\r\nanArray = new int[10];\r\nThe next few lines assign values to each element of the array:\r\nanArray[0] = 100; // initialize first element\r\nanArray[1] = 200; // initialize second element\r\nanArray[2] = 300; // and so forth\r\nEach array element is accessed by its numerical index:\r\nSystem.out.println(\"Element 1 at index 0: \" + anArray[0]);\r\nSystem.out.println(\"Element 2 at index 1: \" + anArray[1]);\r\nSystem.out.println(\"Element 3 at index 2: \" + anArray[2]);\r\nAlternatively, you can use the shortcut syntax to create and initialize an array:\r\nint[] anArray = {\r\n    100, 200, 300,\r\n    400, 500, 600,\r\n    700, 800, 900, 1000\r\n};\r\nHere the length of the array is determined by the number of values provided between braces and separated by commas.\r\nYou can also declare an array of arrays (also known as a multidimensional array) by using two or more sets of brackets, such as String[][] names. Each element, therefore, must be accessed by a corresponding number of index values.\r\nIn the Java programming language, a multidimensional array is an array whose components are themselves arrays. This is unlike arrays in C or Fortran. A consequence of this is that the rows are allowed to vary in length, as shown in the following MultiDimArrayDemo program:\r\nclass MultiDimArrayDemo {\r\n    public static void main(String[] args) {\r\n        String[][] names = {\r\n            {\"Mr. \", \"Mrs. \", \"Ms. \"},\r\n            {\"Smith\", \"Jones\"}\r\n        };\r\n        // Mr. Smith\r\n        System.out.println(names[0][0] + names[1][0]);\r\n        // Ms. Jones\r\n        System.out.println(names[0][2] + names[1][1]);\r\n    }\r\n}\r\nThe output from this program is:\r\nMr. Smith\r\nMs. Jones\r\nFinally, you can use the built-in length property to determine the size of any array. The following code prints the array's size to standard output:\r\n System.out.println(anArray.length);\r\n \r\nThe while and do-while Statements\r\n\r\nThe while statement continually executes a block of statements while a particular condition is true. Its syntax can be expressed as:\r\n\r\nwhile (expression) {\r\n     statement(s)\r\n}\r\nThe while statement evaluates expression, which must return a boolean value. If the expression evaluates to true, the while statement executes the statement(s) in the while block. The while statement continues testing the expression and executing its block until the expression evaluates to false. Using the while statement to print the values from 1 through 10 can be accomplished as in the following WhileDemo program:\r\n\r\n \r\nclass WhileDemo {\r\n    public static void main(String[] args){\r\n        int count = 1;\r\n        while (count < 11) {\r\n            System.out.println(\"Count is: \" + count);\r\n            count++;\r\n        }\r\n    }\r\n}\r\nYou can implement an infinite loop using the while statement as follows:\r\n\r\nwhile (true){\r\n    // your code goes here\r\n}\r\nThe Java programming language also provides a do-while statement, which can be expressed as follows:\r\n\r\ndo {\r\n     statement(s)\r\n} while (expression);\r\nThe difference between do-while and while is that do-while evaluates its expression at the bottom of the loop instead of the top. Therefore, the statements within the do block are always executed at least once, as shown in the following DoWhileDemo program:\r\n\r\n \r\nclass DoWhileDemo {\r\n    public static void main(String[] args){\r\n        int count = 1;\r\n        do {\r\n            System.out.println(\"Count is: \" + count);\r\n            count++;\r\n        } while (count < 11);\r\n    }\r\n}");
		textArea.setBounds(20, 40, 1170, 650);
		add(textArea);

		// set label for array tutorial
		JLabel lblArray = new JLabel("Array");
		lblArray.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblArray.setBounds(560, 0, 88, 37);
		add(lblArray);
		setVisible(true);

	}
}