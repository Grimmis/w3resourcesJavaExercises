package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic063 {

	public static void main(String[] args) {
		/*
		 * Write a Java program that accepts two integer values from 
		 * the user and return the larger values. However if the two 
		 * values are the same, return 0 and return the smaller value 
		 * if the two values have the same remainder when divided by 6.
			Sample Output:
			
			Input the first number : 12                                            
			Input the second number: 13                                            
			Result: 13
		 */

		Scanner inScanner = new Scanner(System.in);
		System.out.print("Input the first number : ");
		int inputIntOne = inScanner.nextInt();
		System.out.print("Input the second number: ");
		int inputIntTwo = inScanner.nextInt();
		
		if (inputIntOne == inputIntTwo) {
			System.out.println(0);
		} else if (inputIntOne % 6 == inputIntTwo % 6 ) {
			if (inputIntOne < inputIntTwo) {
				System.out.println(inputIntOne);
			} else {
				System.out.println(inputIntTwo);
			}
		} else {
			if (inputIntOne > inputIntTwo) {
				System.out.println(inputIntOne);
			} else {
				System.out.println(inputIntTwo);
			}
		}
		
		inScanner.close();
	}

}
