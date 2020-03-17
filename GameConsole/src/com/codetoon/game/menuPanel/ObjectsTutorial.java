package com.codetoon.game.menuPanel;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.Color;

/**
 * Create class information for object tutorial panel
 * @author: Group 2D
 */
public class ObjectsTutorial extends JPanel {
	
	/***************constructor********************/
	public ObjectsTutorial() {
		
		//set layout
		setLayout(null);

		// set label for objects tutorial and size of label
		JLabel lblObjects = new JLabel("Objects");
		lblObjects.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblObjects.setBounds(538, 0, 107, 36);
		add(lblObjects);

		// set information for object type tutorial and set font, type for text area
		TextArea textArea = new TextArea();
		textArea.setBackground(Color.WHITE);
		textArea.setEditable(false);
		textArea.setText("Creating Objects\r\nAs you know, a class provides the blueprint for objects; you create an object from a class. \r\nPoint originOne = new Point(23, 94);\r\nRectangle rectOne = new Rectangle(originOne, 100, 200);\r\nRectangle rectTwo = new Rectangle(50, 100);\r\nThe first line creates an object of the Point class, and the second and third lines each create an object of the Rectangle class.\r\nEach of these statements has three parts (discussed in detail below):\r\n1.\tDeclaration: The code set in bold are all variable declarations that associate a variable name with an object type.\r\n2.\tInstantiation: The new keyword is a Java operator that creates the object.\r\n3.\tInitialization: The new operator is followed by a call to a constructor, which initializes the new object.\r\n\r\nDeclaring a Variable to Refer to an Object\r\nPreviously, you learned that to declare a variable, you write:\r\ntype name;\r\nThis notifies the compiler that you will use name to refer to data whose type is type. With a primitive variable, this declaration also reserves the proper amount of memory for the variable.\r\nYou can also declare a reference variable on its own line. For example:\r\nPoint originOne;\r\nIf you declare originOne like this, its value will be undetermined until an object is actually created and assigned to it. Simply declaring a reference variable does not create an object.\r\n For that, you need to use the new operator.\r\n\r\nInstantiating a Class\r\nThe new operator instantiates a class by allocating memory for a new object and returning a reference to that memory. The new operator also invokes the object constructor.\r\n\r\nThe new operator requires a single, postfix argument: a call to a constructor. The name of the constructor provides the name of the class to instantiate.\r\nThe new operator returns a reference to the object it created. This reference is usually assigned to a variable of the appropriate type, like:\r\nPoint originOne = new Point(23, 94);\r\nInitializing an Object\r\nHere's the code for the Point class:\r\npublic class Point {\r\n    public int x = 0;\r\n    public int y = 0;\r\n    //constructor\r\n    public Point(int a, int b) {\r\n        x = a;\r\n        y = b;\r\n    }\r\n}\r\nThis class contains a single constructor. You can recognize a constructor because its declaration uses the same name as the class and it has no return type. \r\nThe constructor in the Point class takes two integer arguments, as declared by the code (int a, int b). The following statement provides 23 and 94 as values for those arguments:\r\nPoint originOne = new Point(23, 94);\r\nThe result of executing this statement can be illustrated in the next figure:\r\n \r\nUsing Objects\r\nOnce you've created an object, you probably want to use it for something. You may need to use the value of one of its fields, change one of its fields, or call one of its methods to perform an action.\r\nReferencing an Object's Fields\r\nObject fields are accessed by their name. You must use a name that is unambiguous.\r\nYou may use a simple name for a field within its own class. For example, we can add a statement within the Rectangle class that prints the width and height:\r\nSystem.out.println(\"Width and height are: \" + width + \", \" + height);\r\nIn this case, width and height are simple names.\r\nCode that is outside the object's class must use an object reference or expression, followed by the dot (.) operator, followed by a simple field name, as in:\r\nobjectReference.fieldName\r\nCalling an Object's Methods\r\nYou also use an object reference to invoke an object's method. You append the method's simple name to the object reference, with an intervening dot operator (.).\r\n Also, you provide, within enclosing parentheses, any arguments to the method. If the method does not require any arguments, use empty parentheses.\r\nobjectReference.methodName(argumentList);\r\nor:\r\nobjectReference.methodName();\r\nSome methods, such as getArea(), return a value. For methods that return a value, you can use the method invocation in expressions. You can assign the return value to a variable, \r\nuse it to make decisions, or control a loop. This code assigns the value returned by getArea() to the variable areaOfRectangle:\r\nint areaOfRectangle = new Rectangle(100, 50).getArea();\r\n");
		textArea.setBounds(20, 40, 1170, 650);
		add(textArea);

	}

}
