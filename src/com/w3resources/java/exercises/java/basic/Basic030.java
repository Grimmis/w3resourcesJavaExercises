package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic030 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to convert a hexadecimal to a octal number.
			Input Data:
			Input a hexadecimal number: 40
			Expected Output
			
			Equivalent of octal number is: 100 
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a hexadecimal number: ");
		String inputNumberString = scanner.nextLine();
		
		Integer inputNumberStringAsInt = Integer.parseInt(inputNumberString, 16);
		String inputNumberIntAsOctString = Integer.toOctalString(inputNumberStringAsInt);
		System.out.println("Equivalent of octal number is: " + inputNumberIntAsOctString);
		
		scanner.close();
	}

}
