package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic022 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to convert a binary number to decimal number. Go to the editor
			Input Data:
			Input a binary number: 100
			Expected Output
			
			Decimal Number: 4 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a binary number: ");
		String inputNumberString = scanner.nextLine();
		
		int inputNumberStringAsInt = Integer.parseInt(inputNumberString, 2);
		System.out.println("Decimal Number: " + inputNumberStringAsInt);

		scanner.close();
	}

}
