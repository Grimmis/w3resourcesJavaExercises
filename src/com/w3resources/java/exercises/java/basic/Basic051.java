package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic051 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to convert a string to an integer in Java.
			Sample Output:
			
			Input a number(string): 25                                             
			The integer value is: 25
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number(string): ");
		String inputString = scanner.nextLine();
		
		System.out.println("The integer value is: " + Integer.parseInt(inputString));
		
		scanner.close();
	}

}
