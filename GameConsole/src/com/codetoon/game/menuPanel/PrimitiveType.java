package com.codetoon.game.menuPanel;

import javax.swing.*;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import java.awt.TextArea;
import java.awt.ScrollPane;
import java.awt.Canvas;
import java.awt.Choice;
import java.awt.List;
import java.awt.TextField;
import javax.swing.JMenuBar;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JTextPane;
import java.awt.Color;

/**
 * Create class information for primitive tutorial panel
 * @author: Group 2D
 */
public class PrimitiveType extends JPanel {

	/***************constructor********************/
	public PrimitiveType() {
		
		// set layout
		setLayout(null);

		// set information for primitive type objects tutorial and set font, type for text area
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textArea.setBackground(Color.WHITE);
		textArea.setText("The Java programming language is statically-typed, which means that all variables must first be declared before they can be used.\r\n \r\nint: By default, the int data type is a 32-bit signed two's complement integer, which has a minimum value of -231 and a maximum value of 231-1. In Java SE 8 and later, you can use the int data type to represent an unsigned \r\n32-bit integer, which has a minimum value of 0 and a maximum value of 232-1. \r\n\r\nlong: The long data type is a 64-bit two's complement integer. The signed long has a minimum value of -263 and a maximum value of 263-1. In Java SE 8 and later, you can use the long data type to represent an unsigned \r\n64-bit long, which has a minimum value of 0 and a maximum value of 264-1. \r\n\r\nfloat: The float data type is a single-precision 32-bit IEEE 754 floating point. Its range of values is beyond the scope of this discussion, but is specified in the Floating-Point Types, Formats, and Values section of the Java Language \r\nSpecification.\r\n\r\nAs with the recommendations for byte and short, use a float (instead of double) if you need to save memory in large arrays of floating point numbers. \r\n\r\ndouble: The double data type is a double-precision 64-bit IEEE 754 floating point. Its range of values is beyond the scope of this discussion, but is specified in the Floating-Point Types, Formats, and Values section of the\r\n Java Language Specification. \r\n\r\nboolean: The boolean data type has only two possible values: true and false. Use this data type for simple flags that track true/false conditions. \r\n\r\nchar: The char data type is a single 16-bit Unicode character. \r\n\r\nIn addition to the eight primitive data types listed above, the Java programming language also provides special support for character strings via the java.lang.String class. Enclosing your character string within double quotes will\r\n automatically create a new String object; for example, String s = \"this is a string\";. String objects are immutable, which means that once created, their values cannot be changed. \r\nThe String class is not technically a primitive data\r\n type, but considering the \r\nspecial support given to it by the language, you'll probably tend to think of it as such. You'll learn more about the String class in Simple Data Objects\r\n\r\nDefault Values\r\nIt's not always necessary to assign a value when a field is declared. Fields that are declared but not initialized will be set to a reasonable default by the compiler. Generally speaking, this default will be zero or null, depending on\r\n the data type. Relying on such default values, however, is generally considered bad programming style.\r\n\r\nLocal variables are slightly different; the compiler never assigns a default value to an uninitialized local variable. If you cannot initialize your local variable where it is declared, make sure to assign it a value before you attempt to use it.\r\n Accessing an uninitialized local variable will result in a compile-time error.\r\n\r\nLiterals\r\n\r\nYou may have noticed that the new keyword isn't used when initializing a variable of a primitive type. Primitive types are special data types built into the language; they are not objects created from a class.\r\n A literal is the source code representation of a fixed value; literals are represented directly in your code without requiring computation. As shown below, it's possible to assign a literal to a variable of a primitive type:\r\n\r\nboolean result = true;\r\nchar capitalC = 'C';\r\nbyte b = 100;\r\nshort s = 10000;\r\nint i = 100000;\r\n\r\nString literals: \\b (backspace), \\t (tab), \\n (line feed), \\f (form feed), \\r (carriage return), \\\" (double quote), \\' (single quote), and \\\\ (backslash).\r\nThere's also a special null literal that can be used as a value for any reference type. null may be assigned to any variable, except variables of primitive types. There's little you can do with a null value beyond testing for its presence. \r\nTherefore, null is often used in programs as a marker to indicate that some object is unavailable.");
		textArea.setBounds(20, 40, 1170, 650);
		add(textArea);

		// set label for primitives and define size of label
		JLabel lblPrimitiveTypes = new JLabel("Primitive Types");
		lblPrimitiveTypes.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblPrimitiveTypes.setBounds(524, 11, 197, 23);
		add(lblPrimitiveTypes);
		setVisible(true);
	}
}