package com.w3resources.java.exercises.java.basic;

import java.io.Console;
import java.util.Arrays;

public class Basic042 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to input and display your password. Go to the editor
			Expected Output
			
			Input your Password:                                                    
			Your password was: abc@123
		 */
		
		Console cons;
		if ((cons = System.console()) != null) {
			char[] password = null;
			try {
				password = cons.readPassword("Input Your Password: ");
				System.out.println("Your password was: " + new String(password));
			} finally {
				if (password != null) {
					Arrays.fill(password, ' ');
				}
			}
		} else {
			throw new RuntimeException("Can't get password... No console.");
		}
		
	}

}
