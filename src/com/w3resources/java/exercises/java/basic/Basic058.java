package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic058 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to capitalize the first letter of each word in a sentence.
			Sample Output:
			
			Input a Sentence: the quick brown fox jumps over the lazy dog.         
			The Quick Brown Fox Jumps Over The Lazy Dog.
		 */

		Scanner inScanner = new Scanner(System.in);
		System.out.print("Input a Sentence: ");
		String inputString = inScanner.nextLine();
		Scanner lineScanner = new Scanner(inputString);
		String uppercaseString = "";
		
		while (lineScanner.hasNext()) {
			String wordString = lineScanner.next();
			uppercaseString += Character.toUpperCase(wordString.charAt(0)) + wordString.substring(1) + " ";
		}
		
		System.out.println(uppercaseString);
		lineScanner.close();
		inScanner.close();
	}

}
