package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic049 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to accept a number and check the number 
		 * is even or not. Prints 1 if the number is even or 0 if the number is odd.
			Sample Output:
			
			Input a number: 20                                                     
			1
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");
		int inputInt = scanner.nextInt();
		
		int output = (inputInt % 2 == 0) ? 1 : 0;
		System.out.println(output);
		
		scanner.close();
	}

}
