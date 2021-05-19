package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic024 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to convert a binary number to a Octal number. 
			Input Data:
			Input a Binary Number: 111
			Expected Output
			
			Octal number: 7 
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a Binary Number: ");
		String inputNumberString = scanner.nextLine();
		
		Integer inputNumberStringAsInt = Integer.parseInt(inputNumberString, 2);
		String inputNumberAsOctString = Integer.toOctalString(inputNumberStringAsInt);
		System.out.println("Octal number: " + inputNumberAsOctString);
		
		scanner.close();
	}

}
