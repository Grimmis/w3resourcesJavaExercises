package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic020 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to convert a decimal number to hexadecimal number.
			Input Data:
			Input a decimal number: 15
			Expected Output
			
			Hexadecimal number is : F 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a deciml number: ");
		int inputNumber = scanner.nextInt();
		
		String inputNumberAsHexString = Integer.toHexString(inputNumber);
		System.out.println("Hexadecimal number is: " + inputNumberAsHexString.toUpperCase());

		scanner.close();
	}

}
