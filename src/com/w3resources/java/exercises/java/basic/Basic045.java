package com.w3resources.java.exercises.java.basic;

import java.io.File;

public class Basic045 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to find the size of a specified file. 
			Sample Output:
			
			/home/students/abc.txt  : 0 bytes                                      
			/home/students/test.txt : 0 bytes 
		 */
		String myPathString = "/Users/grimm/Documents/Programming/Ruby/hello.rb";

		File myFile = new File(myPathString);
		
		System.out.println(myPathString + "\t: " + myFile.length() + "bytes");
	}

}
