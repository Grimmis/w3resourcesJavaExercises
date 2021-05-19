package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic025 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to convert a octal number to a decimal number.
			Input Data:
			Input any octal number: 10
			Expected Output
			
			Equivalent decimal number: 8
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input any octal number: ");
		String inputNumberString = scanner.nextLine();
		
		Integer inputNumberStringAsInt = Integer.parseInt(inputNumberString, 8);
		System.out.println("Equivalent decimal number: " + inputNumberStringAsInt);
		
		scanner.close();
	}

}
