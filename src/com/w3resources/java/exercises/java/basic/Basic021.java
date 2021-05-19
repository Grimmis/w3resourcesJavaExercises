package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic021 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to convert a decimal number to octal number.
			Input Data:
			Input a Decimal Number: 15
			Expected Output
			
			Octal number is: 17  
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a Decimal Number: ");
		int inputNumber = scanner.nextInt();
		
		String inputNumberAsOctalString = Integer.toOctalString(inputNumber);
		System.out.println("Octal number is: " + inputNumberAsOctalString);
		
		scanner.close();
	}

}
