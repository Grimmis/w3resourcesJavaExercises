package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic044 {

	public static void main(String[] args) {
		/*
		 * Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
			Sample Output:
			
			Input number: 5                                                        
			5 + 55  + 555
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input number: ");
		int myInt = scanner.nextInt();
		String myString = Integer.toString(myInt);
		int myInt2 = Integer.parseInt(myString + myString);
		String myString2 = Integer.toString(myInt2);
		int myInt3 = Integer.parseInt(myString + myString2);
		int mySum = myInt + myInt2 + myInt3;
		
		System.out.println(myInt + " + " + myInt2 + " + " + myInt3 + " = " + mySum);
		
		scanner.close();
	}

}
