package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic032 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to compare two numbers.
			Input Data:
			Input first integer: 25
			Input second integer: 39
			Expected Output
			
			25 != 39                                                                          
			25 < 39                                                                           
			25 <= 39
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input first integer: ");
		int inputNumberOne = scanner.nextInt();
		System.out.print("Input second integer: ");
		int inputNumberTwo = scanner.nextInt();
		
		if (inputNumberOne == inputNumberTwo) {
			System.out.println(inputNumberOne + " == " + inputNumberTwo);
		} else {
			System.out.println(inputNumberOne + " != " + inputNumberTwo);
			if (inputNumberOne < inputNumberTwo) {
				System.out.println(inputNumberOne + " < " + inputNumberTwo);
				System.out.println(inputNumberOne + " <= " + inputNumberTwo);
			} else {
				System.out.println(inputNumberOne + " > " + inputNumberTwo);
				System.out.println(inputNumberOne + " >= " + inputNumberTwo);
			}
		}

		scanner.close();
	}

}
