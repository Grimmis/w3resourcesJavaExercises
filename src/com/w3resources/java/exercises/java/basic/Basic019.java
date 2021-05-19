package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic019 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to convert a decimal number to binary number.
			Input Data:
			Input a Decimal Number : 5
			Expected Output
			
			Binary number is: 101 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a Decimal Number: ");
		int inputNumber = scanner.nextInt();
		
		String inputNumberAsBinaryString = Integer.toBinaryString(inputNumber);
		
		System.out.println("Binary number is: " + inputNumberAsBinaryString);
		
		scanner.close();
	}

}
