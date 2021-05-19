package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic086 {
	
	private static int basic86rec(int n) {
		System.out.println(n);
		if (n == 1) {
			return 1;
		} else if (n % 2 == 0) {
			return basic86rec(n / 2);
		} else {
			return basic86rec((n * 3) + 1);
		}
	}

	public static void main(String[] args) {
		/*
		 * Write a Java program start with an integer n, divide n by 2 if n is even 
		 * or multiply by 3 and add 1 if n is odd, repeat the process until n = 1.
		 */

		Scanner inputScanner = new Scanner(System.in);
		int inputInt;
		System.out.print("Input: ");
		try {
			inputInt = inputScanner.nextInt();
			basic86rec(inputInt);
		} catch (Exception e) {
			throw new Error("Problem reading input: " + e);
		} finally {
			inputScanner.close();
		}
	}

}
