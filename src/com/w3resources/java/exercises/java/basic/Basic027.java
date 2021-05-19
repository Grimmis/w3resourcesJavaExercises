package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic027 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to convert a octal number to a hexadecimal number.
			Input Data:
			Input a octal number : 100
			Expected Output
			
			Equivalent hexadecimal number: 40
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input an octal number: ");
		String inputNumberString = scanner.nextLine();
		
		Integer inputNumberStringAsInt = Integer.parseInt(inputNumberString, 8);
		String inputNumberIntAsHexString = Integer.toHexString(inputNumberStringAsInt);
		System.out.println("Equivalent hexadecimal number: " + inputNumberIntAsHexString);
		
		scanner.close();
	}

}
