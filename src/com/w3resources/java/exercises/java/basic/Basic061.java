package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic061 {

	public static void main(String[] args) {
		/*
		 *  Write a Java program to reverse a word. 
			Sample Output:
			
			Input a word: dsaf
			Reverse word: fasd
		 */

		Scanner inScanner = new Scanner(System.in);
		System.out.print("Input a word: ");
		String inputString = inScanner.nextLine();
		String reverseString = "";
		for (int i = inputString.length() - 1; i >= 0; i--) {
			reverseString += inputString.charAt(i);
		}
		
		System.out.println("Reverse word: " + reverseString);
		
		inScanner.close();
	}

}
