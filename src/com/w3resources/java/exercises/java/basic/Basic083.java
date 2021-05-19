package com.w3resources.java.exercises.java.basic;

import java.util.Arrays;

public class Basic083 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to multiply corresponding elements of 
		 * two arrays of integers.
			Sample Output:
			
			Array1: [1, 3, -5, 4]                                                  
			                                                                       
			Array2: [1, 4, -5, -2]                                                 
			                                                                       
			Result: 1 12 25 -8
		 */

		int[] array1 = {1, 3, -5, 4};
		System.out.println("Array1: " + Arrays.toString(array1));
		
		int[] array2 = {1, 4, -5, -2};
		System.out.println("Array2: " + Arrays.toString(array2));
		
		int[] result = new int[array1.length];
		
		if (array1.length != array2.length) {
			throw new Error("Arrays not of same length...");
		}
		
		for (int i = 0; i < result.length; i++) {
			result[i] = array1[i] * array2[i];
		}
		
		String resultString = Arrays.toString(result);
		System.out.println("Result: " + resultString.substring(1, resultString.length() - 1));
	}

}
