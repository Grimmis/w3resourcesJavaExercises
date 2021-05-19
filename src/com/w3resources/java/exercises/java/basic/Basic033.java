package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic033 {

	public static void main(String[] args) {
		/*
		 * Write a Java program and compute the sum of the digits of an integer.
			Input Data:
			Input an integer: 25
			Expected Output
			
			The sum of the digits is: 7
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input an integer: ");
		String inputNumber = scanner.nextLine();
		
		int sum = 0;
		Character charString = ' ';
		for (int i = 0; i < inputNumber.length(); i++) {
			 charString = inputNumber.charAt(i);
			 sum += Integer.parseInt(charString.toString());
		}
		
		System.out.println("The sum of the digits is: " + sum);
		
		scanner.close();
	}

}
