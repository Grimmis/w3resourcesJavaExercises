package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic053 {

	public static void main(String[] args) {
		/*
		 * Write a Java program that accepts three integers from the user 
		 * and return true if the second number is greater than first number 
		 * and third number is greater than second number. If "abc" is true 
		 * the second number does not need to be greater than first number.
			Sample Output:
			
			Input the first number : 5                                             
			Input the second number: 10                                            
			Input the third number : 15                                            
			The result is: true
					 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the first number: ");
		int inputIntFirst = scanner.nextInt();
		System.out.print("Input the second number: ");
		int inputIntSecond = scanner.nextInt();
		System.out.print("Input the third number: ");
		int inputIntThird = scanner.nextInt();
		
		Boolean resultBoolean = (inputIntSecond > inputIntFirst && inputIntThird > inputIntSecond) 
				? true : false;
		System.out.println("The result is: " + resultBoolean);
		
		scanner.close();
	}

}
