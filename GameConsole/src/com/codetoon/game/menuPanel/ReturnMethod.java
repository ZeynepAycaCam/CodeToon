package com.codetoon.game.menuPanel;

import javax.swing.JPanel;
import java.awt.TextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

/**
 * Create class for information of method's return type
 * @author: Group 2D
 */
public class ReturnMethod extends JPanel {

	/***************constructor********************/
	public ReturnMethod() {
		
		//set layout
		setLayout(null);

		// set information for return a value from a method and set font, type for text area
		TextArea textArea = new TextArea();
		textArea.setBackground(Color.WHITE);
		textArea.setEditable(false);
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textArea.setText("A method returns to the code that invoked it when it completes all the statements in the method, reaches a return statement.\r\nwhichever occurs first.\r\nYou declare a method's return type in its method declaration. Within the body of the method, you use the return statement to return the value.\r\n\r\nAny method declared void doesn't return a value. It does not need to contain a return statement.\r\n\r\nIf you try to return a value from a method that is declared void, you will get a compiler error.\r\n\r\nAny method that is not declared void must contain a return statement with a corresponding return value, like this:\r\n\r\nreturn returnValue;\r\n\r\nThe data type of the return value must match the method's declared return type; you can't return an integer value from a method declared to return a boolean.\r\nThe getArea() method in the Rectangle Rectangle class that was discussed in the sections on objects returns an integer:\r\n    // a method for computing the area of the rectangle\r\n    public int getArea() {\r\n        return width * height;\r\n    }\r\n\r\nThis method returns the integer that the expression width*height evaluates to.\r\nThe getArea method returns a primitive type. A method can also return a reference type. For example, in a program to manipulate Bicycle objects, we might have a method like this:\r\n\r\npublic Bicycle seeWhosFastest(Bicycle myBike, Bicycle yourBike,\r\n                              Environment env) {\r\n    Bicycle fastest;\r\n    // code to calculate which bike is \r\n    // faster, given each bike's gear \r\n    // and cadence and given the \r\n    // environment (terrain and wind)\r\n    return fastest;\r\n}\r\n\r\nUsing the this Keyword\r\n\r\nWithin an instance method or a constructor, this is a reference to the current object \u2014 the object whose method or constructor is being called. You can refer to any member of the current object from within an instance method or a constructor by using this.\r\n\r\nUsing this with a Field\r\n\r\nThe most common reason for using the this keyword is because a field is shadowed by a method or constructor parameter.\r\nFor example, the Point class was written like this\r\npublic class Point {\r\n    public int x = 0;\r\n    public int y = 0;\r\n        \r\n    //constructor\r\n    public Point(int a, int b) {\r\n        x = a;\r\n        y = b;\r\n    }\r\n}\r\n\r\nbut it could have been written like this:\r\n\r\npublic class Point {\r\n    public int x = 0;\r\n    public int y = 0;\r\n        \r\n    //constructor\r\n    public Point(int x, int y) {\r\n        this.x = x;\r\n        this.y = y;\r\n    }\r\n}\r\n\r\nEach argument to the constructor shadows one of the object's fields \u2014 inside the constructor x is a local copy of the constructor's first argument. To refer to the Point field x, the constructor must use this.x.\r\n\r\nUsing this with a Constructor\r\n\r\nFrom within a constructor, you can also use the this keyword to call another constructor in the same class. Doing so is called an explicit constructor invocation. Here's another Rectangle class, with a different implementation from the one in the Objects section.\r\npublic class Rectangle {\r\n    private int x, y;\r\n    private int width, height;\r\n        \r\n    public Rectangle() {\r\n        this(0, 0, 1, 1);\r\n    }\r\n    public Rectangle(int width, int height) {\r\n        this(0, 0, width, height);\r\n    }\r\n    public Rectangle(int x, int y, int width, int height) {\r\n        this.x = x;\r\n        this.y = y;\r\n        this.width = width;\r\n        this.height = height;\r\n    }\r\n    ...\r\n}\r\n\r\nThis class contains a set of constructors. Each constructor initializes some or all of the rectangle's member variables. The constructors provide a default value for any member variable whose initial value is not provided by an argument. For example, the no-argument constructor creates a 1x1 Rectangle at coordinates 0,0. The two-argument constructor calls the four-argument constructor, passing in the width and height but always using the 0,0 coordinates. As before, the compiler determines which constructor to call, based on the number and the type of arguments.\r\n\r\nIf present, the invocation of another constructor must be the first line in the constructor.\r\n\r\nControlling Access to Members of a Class\r\n\r\nAccess level modifiers determine whether other classes can use a particular field or invoke a particular method. There are two levels of access control:\r\n\r\nAt the top level\u2014public, or package-private (no explicit modifier). \r\nAt the member level\u2014public, private, protected, or package-private (no explicit modifier). \r\nA class may be declared with the modifier public, in which case that class is visible to all classes everywhere. If a class has no modifier (the default, also known as package-private), it is visible only within its own package (packages are named groups of related classes \u2014 you will learn about them in a later lesson.) \r\n\r\nAt the member level, you can also use the public modifier or no modifier (package-private) just as with top-level classes, and with the same meaning. For members, there are two additional access modifiers: private and protected. The private modifier specifies that the member can only be accessed in its own class. The protected modifier specifies that the member can only be accessed within its own package (as with package-private) and, in addition, by a subclass of its class in another package.\r\n                      \r\nThe first data column indicates whether the class itself has access to the member defined by the access level. As you can see, a class always has access to its own members. The second column indicates whether classes in the same package as the class (regardless of their parentage) have access to the member. The third column indicates whether subclasses of the class declared outside this package have access to the member. The fourth column indicates whether all classes have access to the member.");
		textArea.setBounds(20, 40, 1170, 650);
		add(textArea);

		// set label for return values which come from method and define size of label
		JLabel lblReturningAValue = new JLabel("Returning a Value from a Method");
		lblReturningAValue.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblReturningAValue.setBounds(400, 11, 414, 29);
		add(lblReturningAValue);

	}

}