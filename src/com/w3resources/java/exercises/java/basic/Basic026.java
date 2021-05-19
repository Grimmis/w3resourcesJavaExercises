package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic026 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to convert a octal number to a binary number. Go to the editor
			Input Data:
			Input any octal number: 7
			Expected Output
			
			Equivalent binary number: 111 
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input any octal number: ");
		String inputNumberString = scanner.nextLine();
		
		Integer inputNumberStringAsInt = Integer.parseInt(inputNumberString, 8);
		String inputNumberIntAsBinaryString = Integer.toBinaryString(inputNumberStringAsInt);
		System.out.println("Equivalent binary number: " + inputNumberIntAsBinaryString);
		
		scanner.close();
	}

}
