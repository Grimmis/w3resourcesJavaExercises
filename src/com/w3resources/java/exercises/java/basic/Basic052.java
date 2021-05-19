package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic052 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to calculate the sum of two integers 
		 * and return true if the sum is equal to a third integer.
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
		
		Boolean resultBoolean = inputIntFirst + inputIntSecond == inputIntThird;
		System.out.println("The result is: " + resultBoolean);
		
		scanner.close();
	}

}
