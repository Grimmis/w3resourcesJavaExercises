package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic006 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to print the sum (addition), multiply, 
		   subtract, divide and remainder of two numbers.
			Test Data:
			Input first number: 125
			Input second number: 24
			Expected Output :
			125 + 24 = 149
			125 - 24 = 101
			125 x 24 = 3000
			125 / 24 = 5
			125 mod 24 = 5
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input first number: ");
		int firstNum = scanner.nextInt();
		System.out.print("Input second number: ");
		int secondNum = scanner.nextInt();
		
		System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
		System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
		System.out.println(firstNum + " x " + secondNum + " = " + (firstNum * secondNum));
		System.out.println(firstNum + " / " + secondNum + " = " + (firstNum / secondNum));
		System.out.println(firstNum + " mod " + secondNum + " = " + (firstNum % secondNum));
		
		scanner.close();

	}

}
