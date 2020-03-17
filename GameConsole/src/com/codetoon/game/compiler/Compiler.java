package com.codetoon.game.compiler;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Compiler class to compile code which come from user
 * @Authors Group 2D
 */

public class Compiler {

	// parameters
	
	private String output;

	// constructors
	
	public Compiler() {
		output = "";
	}

	// methods
	
	/**
	 * ReadOutput of a command
	 * @param name is the command
	 * @param input is the inputStream
	 * @return null
	 */
	
	public String readOutput(String name, InputStream input) throws Exception {
		String line = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(input));
		// read until readLine return null, and put it in a output
		while ((line = reader.readLine()) != null) {
			output = output + line + "\n";
		}
		return null;
	}
	
	/**
	 * Running specific command 
	 * @param command is the command we want to execute
	 * @return exitValue from the compiler
	 */

	public int runProcess(String command) throws Exception {
		Process pro = Runtime.getRuntime().exec(command);
		output = "";
		readOutput(command + " stderr:", pro.getErrorStream());
		readOutput(command + " stdout:", pro.getInputStream());
		pro.waitFor();
		int exitValue = pro.exitValue();
		return exitValue;
	}
	
	/**
	 * Getting output
	 * @return output from the compiler 
	 */
	
	public String getOutput() {
		return output;
	}

}