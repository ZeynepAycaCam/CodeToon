package com.codetoon.game.menuPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Create class for hold all tutorials in one tutorial panel and create main page of game
 * @author: Group 2D
 */
public class TutorialPanel extends JPanel {
	
	JPanel panel; // general panel
	Menu mn; // menu panel
	
     //create tab panes for holding components of menu and tutorial
	JTabbedPane tp;
	JTabbedPane tp2;

	/***************constructor********************/
	public TutorialPanel() {

		//set layout
		setLayout(new BorderLayout());

		mn = new Menu(); // create menu panel
		tp2 = new JTabbedPane(); // main tab pane for add menu and tutorial
		tp = new JTabbedPane(); // tab pane for each tutorial component
		tp2.addTab("Menu", mn); // add menu to main tab pane

		// create primitive type panel and add tab pane
		PrimitiveType primitiveType = new PrimitiveType();
		tp.addTab("PrimitiveTypes", primitiveType);
		
		// create array tutorial panel and add tab pane
		ArrayTutorial arrays = new ArrayTutorial();
		tp.addTab("Arrays", arrays);

		// create operator tutorial panel and add tab pane
		Operators operators = new Operators();
		tp.addTab("Operators", operators);

		// create else and if statement tutorial panel and add tab pane
		Elself elseif = new Elself();
		tp.addTab("If/Else", elseif);

		// create for loop tutorial panel and add tab pane
		For forStatement = new For();
		tp.addTab("For", forStatement);

		// create class tutorial panel and add tab pane
		Classes classes = new Classes();
		tp.addTab("Classes", classes);

		// create declaring class tutorial panel and add tab pane
		DecClasses decClasses = new DecClasses();
		tp.addTab("Declaring Classes", decClasses);

		// create return value of methods tutorial panel and add tab pane
		ReturnMethod returnMethods = new ReturnMethod();
		tp.addTab("Return Method", returnMethods);

		// create object tutorial panel and add tab pane
		ObjectsTutorial objectsType = new ObjectsTutorial();
		tp.addTab("Objects", objectsType);

		// create while loop tutorial panel and add tab pane
		While whileType = new While();
		tp.addTab("While", whileType);

		
		tp2.addTab("Tutorials", tp);//add all tab in one main tab pane
		this.add(tp2); // add tutorial to main tab pane
		
		// set panel size
		setPreferredSize(new Dimension(1100, 700));
		setMaximumSize(new Dimension(1100, 700));
		setMinimumSize(new Dimension(1100, 700));

		setVisible(true);

	}

	@Override
	/*
	 * override of getPrefferredSize()
	 * @return Dimension of panel
	 * 
	 */
	public Dimension getPreferredSize() {
		return (new Dimension(1200, 700));
	}
}