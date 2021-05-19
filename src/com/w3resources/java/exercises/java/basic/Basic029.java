package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic029 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to convert a hexadecimal to a binary number.
			Input Data:
			Enter Hexadecimal Number : 37
			Expected Output
			
			Equivalent Binary Number is: 110111
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Hexadecimal Number : ");
		String inputNumberString = scanner.nextLine();
		
		Integer inputNumberStringAsInt = Integer.parseInt(inputNumberString, 16);
		String inputNumberIntAsBinaryString = Integer.toBinaryString(inputNumberStringAsInt);
		System.out.println("Equivalent Binary Number is: " + inputNumberIntAsBinaryString);
		
		scanner.close();
	}

}
