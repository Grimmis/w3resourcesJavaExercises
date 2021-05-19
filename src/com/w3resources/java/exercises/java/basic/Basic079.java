package com.w3resources.java.exercises.java.basic;

import java.util.Arrays;

public class Basic079 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to rotate an array (length 3) of 
		 * integers in left direction.
			Sample Output:
			
			Original Array: [20, 30, 40]                                           
			Rotated Array: [30, 40, 20]
		 */

		int[] originalArray = {20, 30, 40};
		int[] rotatedArray = new int[3];
		rotatedArray[originalArray.length - 1] = originalArray[0];
		
		for (int i = 1; i < originalArray.length; i++) {
			rotatedArray[i - 1] = originalArray[i];
		}
		
		System.out.println("Original Array: " + Arrays.toString(originalArray));
		System.out.println("Rotated Array: " + Arrays.toString(rotatedArray));
	}

}
