package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic028 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to convert a hexadecimal to a decimal number. Go to the editor
			Input Data:
			Input a hexadecimal number: 25
			Expected Output
			
			Equivalent decimal number is: 37
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a hexadecimal number: ");
		String inputNumberString = scanner.nextLine();
		
		Integer inputNumberStringAsInt = Integer.parseInt(inputNumberString, 16);
		System.out.println("Equivalent decimal number is: " + inputNumberStringAsInt);
		
		scanner.close();
	}

}
