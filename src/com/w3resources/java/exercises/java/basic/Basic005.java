package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic005 {

	public static void main(String[] args) {
		/*
		 *  Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
			Test Data:
			Input first number: 25
			Input second number: 5
			Expected Output :
			25 x 5 = 125
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input first number: ");
		int firstNum = scanner.nextInt();
		System.out.print("Input second number: ");
		int secondNum = scanner.nextInt();
		
		System.out.println(firstNum + " x " + secondNum+ " = " + (firstNum * secondNum));
		
		scanner.close();
	}

}
