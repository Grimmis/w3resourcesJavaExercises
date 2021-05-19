package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic037 {

	public static void main(String[] args) {
		/*
		 *  Write a Java program to reverse a string.
			Input Data:
			Input a string: The quick brown fox
			Expected Output
			
			Reverse string: xof nworb kciuq ehT
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a string: ");
		String inputString = scanner.nextLine();
		String reversedString = new String();
		
		for (int i = inputString.length() - 1; i >= 0; i--) {
			reversedString += inputString.charAt(i);
		}
		
		System.out.println("Reverse string: " + reversedString);
		
		scanner.close();
	}

}
