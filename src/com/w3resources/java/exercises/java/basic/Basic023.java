package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic023 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to convert a binary number to hexadecimal number.
			Input Data:
			Input a Binary Number: 1101
			Expected Output
			
			HexaDecimal value: D
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a Binary Number: ");
		String inputNumberString = scanner.nextLine();
		
		Integer inputNumberStringAsInt = Integer.parseInt(inputNumberString, 2);
		String inputNumberIntAsHexString = Integer.toHexString(inputNumberStringAsInt);
		System.out.println("HexaDecimal value: " + inputNumberIntAsHexString.toUpperCase());
		
		scanner.close();
	}

}
