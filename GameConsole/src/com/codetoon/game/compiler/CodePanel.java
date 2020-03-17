package com.codetoon.game.compiler;

import javax.swing.JPanel;
import javadb.Questions;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

/**
 * CodePanel is the panel which user can see question and write proper code
 * according to question. Then user can compile and run this code, also can see
 * compile output in this panel
 * 
 * @author Group 2D
 */

public class CodePanel extends JPanel {

	// parameters

	private static final long serialVersionUID = -4480280771256136656L;
	private String questionAnswer;
	private String output;
	private FileCreator creator;
	private Compiler compiler;
	private String userCode;
	private int heart;
	private Questions database;
	public static boolean trueAnswer;
	private int count;
	JFrame frame;

	// constructor

	public CodePanel() {

		// set properties of panel
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(500, 700));
		setLayout(null);

		// construct properties

		userCode = "";
		output = "";
		heart = 5;
		creator = new FileCreator();
		compiler = new Compiler();
		database = new Questions();
		trueAnswer = false;
		count = 1;

		// create text area for console (compiler output)
		TextArea consoleArea = new TextArea();
		consoleArea.setBounds(22, 484, 452, 104);
		add(consoleArea);
		consoleArea.setEditable(false);

		// create text area for code which user will enter
		TextArea codeArea = new TextArea();
		codeArea.setBounds(22, 237, 455, 194);
		add(codeArea);

		// create text area for questionArea where user can see question
		TextArea questionArea = new TextArea();
		questionArea.setBounds(24, 52, 450, 123);
		add(questionArea);
		questionArea.setEditable(false);

		// get question from database according to count and show it on the
		// questionArea
		
		/*
		database.createConnection();
		questionAnswer = database.selectAnswer(count);
		questionArea.setText(database.selectQuestions(count));
		codeArea.setText(database.selectChangeable(count));
		database.shutdown();
		*/
		
		// changes
		
		questionAnswer = "6";

		// heart label to illustrate heart count( player's live )
		JLabel heartLabel = new JLabel("x " + heart);
		heartLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		heartLabel.setForeground(Color.WHITE);
		heartLabel.setBounds(465, 15, 25, 35);
		add(heartLabel);

		// create button for compile and run
		JButton compileAndRunButton = new JButton("Compile and Run\r\n");
		compileAndRunButton.addActionListener(new ActionListener() {

			// action performed method for compileAndRun button
			public void actionPerformed(ActionEvent arg0) {

				// get code from user, put in it a class ( in this case , public
				// class test{} ) and put it in a string
				userCode = "";
				// userCode = "public class test {" + codeArea.getText() + "}";
				// oynama
				userCode = "public class test { public static void main ( String[] args ){ Sytem.out.println(\"6\"); } }";

				// create new text file with this string by calling fileCreator
				// method of FileCreator object
				creator.fileCreator(userCode);

				try {

					// get question from database according to count and show it
					// on the questionArea
					//database.createConnection();
					//questionAnswer = database.selectAnswer(count);
					//questionArea.setText(database.selectQuestions(count));
					
					// oynama
					questionArea.setText("6 bastir");
					//codeArea.setText(database.selectChangeable(count));
					codeArea.setText("6 bastir");
					//database.shutdown();

					// compile the text file we created
					int exitValue = compiler.runProcess("javac test.java");

					// clear the console area
					String clearString = new String("");
					consoleArea.setText(clearString);

					// if compilation is not successful, update the consoleArea
					// with the error came from the compiler and make
					// decreaseHeart true
					if (exitValue != 0) {

						// show the output on console area
						output = compiler.getOutput();
						consoleArea.setText(output);
						// if hearth is less than 0, game is over
						if (heart < 0) {
							isGameOver();
						} else {
							heart--; // if game is not over decrease heart and
										// show it on heart label
							heartLabel.setText("x " + heart);
						}

					}
					// if compilation is successful run the code and compare the
					// output with question's answer
					else {
						compiler.runProcess("java test");
						output = compiler.getOutput();

						// set the console area so user can see output of the
						// code consoleArea.
						consoleArea.setText(output);

						// to compare the output, firstly get rid of with empty
						// spaces in both output and question answer
						output = output.replaceAll(" ", "");
						output = output.replaceAll("\n", "");
						questionAnswer = questionAnswer.replace(" ", "");
						questionAnswer = questionAnswer.replaceAll("\n", "");

						// then compare output with the question's answer
						if (output.equalsIgnoreCase(questionAnswer)) {
							// if they are same, set the trueAnswer to true and
							// increase count so that
							// user can see other question
							trueAnswer = true;
							count++;

							// also update question area and code area according
							// to count
							
							questionArea.setText("6 bastir");
							//codeArea.setText(database.selectChangeable(count));
							codeArea.setText("6 bastir");
							//database.shutdown();
							
							/*
							database.createConnection();
							questionAnswer = database.selectAnswer(count);
							questionArea.setText(database.selectQuestions(count));
							codeArea.setText(database.selectChangeable(count));
							database.shutdown();
							
							*/
						} else {
							// if the output isn't same with question answer,
							// decrease heart and update heart label
							if (heart < 0) {
								isGameOver();
							} else {
								heart--;
								heartLabel.setText("x " + heart);
							}
						}
					}

				} catch (Exception e) {
					e.printStackTrace();

				}

				if (isGameOver()) {
					// if game is over show it with JOption pane
					frame = new JFrame("JOptionPane showMessageDialog example");
					JOptionPane.showMessageDialog(frame, " Game Over");
					System.exit(0);
				}

			}
		});
		compileAndRunButton.setBounds(71, 610, 225, 63);
		add(compileAndRunButton);

		// hint button for showing hint if user want to get help
		JButton hintButton = new JButton("Hint");
		hintButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// if hint button is clicked, it get hint from database and show
				// it with JOption pane.
				
				JOptionPane.showMessageDialog(null, "hint!" );
				/*
				database.createConnection();
				JOptionPane.showMessageDialog(null, database.selectHint(count));
				database.shutdown();
				*/
			}
		});
		hintButton.setBackground(Color.WHITE);
		hintButton.setForeground(Color.BLACK);
		hintButton.setBounds(345, 630, 109, 29);
		add(hintButton);

		// question label (header)
		JLabel lblQuestion = new JLabel("Question");
		lblQuestion.setForeground(Color.WHITE);
		lblQuestion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblQuestion.setBounds(205, 11, 91, 35);
		add(lblQuestion);

		// code area label (header)
		JLabel lblCodeArea = new JLabel("Code Area");
		lblCodeArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCodeArea.setForeground(Color.WHITE);
		lblCodeArea.setBounds(196, 193, 138, 29);
		add(lblCodeArea);

		// output label ( header )
		JLabel lblOutput = new JLabel("Output");
		lblOutput.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblOutput.setForeground(Color.WHITE);
		lblOutput.setBounds(209, 447, 125, 25);
		add(lblOutput);

		// image label for background image
		JLabel lblImage = new JLabel("New label");
		lblImage.setIcon(new ImageIcon("C:\\Users\\Zeynep\\Desktop\\GameConsole\\heart.png"));
		lblImage.setBounds(434, 15, 40, 35);
		add(lblImage);

	}

	// methods

	/**
	 * Method for getting compiler output
	 * @return output that came from compiler
	 */

	public String getUserAnswer() {
		return output;
	}

	/**
	 * Method for getting Heart
	 * @return heart property
	 */

	public int getHeart() {
		return heart;
	}

	/**
	 * Method for getting isGameOver
	 * @return true is heart is less than 0, otherwise return false
	 */

	public boolean isGameOver() {
		if (heart < 0)
			return true;
		return false;
	}

	/**
	 * Method for getting trueAnswer
	 * @return true is answer is true, otherwise return false
	 */

	public boolean getTrueAnswer() {
		return trueAnswer;
	}

	/**
	 * Method for setting trueAnswer
	 * @param answer is the boolean we want to set trueAnswer
	 */

	public void setTrueAnswer(boolean answer) {
		trueAnswer = answer;
	}

}