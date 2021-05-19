package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic059 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to convert a given string into lowercase.
			Sample Output:
			
			Input a String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.           
			the quick brown fox jumps over the lazy dog.
		 */

		Scanner inScanner = new Scanner(System.in);
		System.out.print("Input a String: ");
		String inputString = inScanner.nextLine();
		String lowercaseString = "";
		
		for (int i = 0; i < inputString.length(); i++) {
			if (Character.isAlphabetic(inputString.charAt(i))) {
				lowercaseString += Character.toLowerCase(inputString.charAt(i));
			} else {
				lowercaseString += inputString.charAt(i);
			}
		}
		
		System.out.println(lowercaseString);
		
		inScanner.close();
	}

}
