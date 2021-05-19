package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic065 {

	public static int myMod(int x, int y) {
		return x - ((x / y) * y);
	}
	
	public static void main(String[] args) {
		/*
		 * Write a Java program to calculate the modulus of two numbers 
		 * without using any inbuilt modulus operator.
			Sample Output:
			
			Input the first number : 19                                            
			Input the second number: 7                                             
			5
		 */

		Scanner inScanner = new Scanner(System.in);
		System.out.print("Input the first number : ");
		int inputIntOne = inScanner.nextInt();
		System.out.print("Input the second number: ");
		int inputIntTwo = inScanner.nextInt();
		
		System.out.println(myMod(inputIntOne, inputIntTwo));
		
		inScanner.close();
	}

}
