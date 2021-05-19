package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic054 {

	public static void main(String[] args) {
		/*
		 * Write a Java program that accepts three integers from the user 
		 * and return true if two or more of them (integers ) have the 
		 * same rightmost digit. The integers are non-negative.
			Sample Output:
			
			Input the first number : 5                                             
			Input the second number: 10                                            
			Input the third number : 15                                            
			The result is: true
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the first number: ");
		int inputIntFirst = scanner.nextInt();
		if (inputIntFirst < 0) {
			scanner.close();
			throw new Error("Expected non-negative input.");
		}
		System.out.print("Input the second number: ");
		int inputIntSecond = scanner.nextInt();
		if (inputIntSecond < 0) {
			scanner.close();
			throw new Error("Expected non-negative input.");
		}
		System.out.print("Input the third number: ");
		int inputIntThird = scanner.nextInt();
		if (inputIntThird < 0) {
			scanner.close();
			throw new Error("Expected non-negative input.");
		}
		
		int firstLD = inputIntFirst % 10;
		int secondLD = inputIntSecond % 10;
		int thirdLD = inputIntThird % 10;
		
		Boolean resultBoolean;
		if (firstLD == secondLD) {
			resultBoolean = true;
		} else if (firstLD == thirdLD) {
			resultBoolean = true;
		} else if (secondLD == thirdLD) {
			resultBoolean = true;
		} else {
			resultBoolean = false;
		}
		System.out.println("The result is: " + resultBoolean);
		
		scanner.close();
	}

}
