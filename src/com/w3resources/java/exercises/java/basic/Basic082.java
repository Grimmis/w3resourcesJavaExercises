package com.w3resources.java.exercises.java.basic;

import java.util.Arrays;

public class Basic082 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to find the largest element between first, 
		 * last, and middle values from an array of integers (even length).
			Sample Output:
			
			Original Array: [20, 30, 40, 50, 67]                                   
			Largest element between first, last, and middle values: 67 
		 */

		int[] originalArray = {20, 30, 40, 50, 67};
		int first = originalArray[0], last = originalArray[originalArray.length - 1];
		int middle = originalArray[(int)((originalArray.length - 1) / 2)];
		int firstMiddleLastMax = Math.max(Math.max(first, middle), last);
		
		System.out.println("Original Array: " + Arrays.toString(originalArray));
		System.out.println("Largest element between first, last, and middle values: " + firstMiddleLastMax);
	}

}
