package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic057 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to accepts an integer and count the factors of the number.
			Sample Output:
			
			Input an integer: 25                                                   
			3
		 */
		
		Scanner scanner = new Scanner(System.in);
		int count = 1;
		try {
			System.out.print("Input an integer: ");
			int inputInt = scanner.nextInt();
			for (int i = 1; i < inputInt / 2; i++) {
				if (inputInt % i == 0) {
					count++;
				}
			}
		} finally {
			System.out.println(count);
			scanner.close();
		}
		
	}

}
