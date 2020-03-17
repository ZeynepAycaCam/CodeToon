package com.codetoon.game.compiler;

import java.io.*;

/*
* FileCretor is  to create file which will compile and run.
* Also ,string is put to the file in FileCretor
* @author Group 2D
* @version 29.04.2017
* */
public class FileCreator {
	boolean check; 
	public void fileCreator(String other) {
		File file = null;
		check = false;
		try {
			// create new file
			file = new File("test.java") ;
			// tries to create new file in the system
			check = file.createNewFile( ) ;
			// deletes file from the system
			file.delete( ) ;
			// tries to create new file in the system
			check = file.createNewFile( ) ;
		} catch ( Exception e ) {
			e.printStackTrace( ) ;
		}

		try {
			BufferedWriter out = new BufferedWriter( new FileWriter("test.java") ) ;
			out.write( other ) ; // put string to the file 
			out.close( ) ;
		} catch ( IOException e ) {
			System.out.println("Exception ");

		}
	}
}