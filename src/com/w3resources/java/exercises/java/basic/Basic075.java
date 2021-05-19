package com.w3resources.java.exercises.java.basic;

public class Basic075 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to test if the first and the last 
		 * element of an array of integers are same. The length of 
		 * the array must be greater than or equal to 2.
			Test Data: array = 50, -20, 0, 30, 40, 60, 10
			Sample Output:
			
			false
		 */

		int[] array = {50, -20, 0, 30, 40, 60, 10};
		boolean result = false;
		
		if (array.length < 2) {
			throw new Error("Int array length must be greater or equal to 2...");
		}
		
		if (array[0] == array[array.length - 1]) {
			result = true;
		}
		
		System.out.println(result);
	}

}
