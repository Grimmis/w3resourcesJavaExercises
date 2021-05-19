package com.w3resources.java.exercises.java.basic;

public class Basic074 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to test if 10 appears as either the first or
		 * last element of an array of integers. The length of the array must 
		 * be greater than or equal to 2.
			Sample Output:
			Test Data: array = 10, -20, 0, 30, 40, 60, 10
			
			true
		 */

		int[] array = {10, -20, 0, 30, 40, 60, 10};
		boolean result = false;
		
		if (array.length < 2) {
			throw new Error("Array must be larger than 2...");
		}
		
		if (array[0] == 10
				|| array[array.length - 1] == 10) {
			result = true;
		}
		
		System.out.println(result);
	}

}
