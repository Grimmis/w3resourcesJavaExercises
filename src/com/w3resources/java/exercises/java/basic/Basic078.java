package com.w3resources.java.exercises.java.basic;

import java.util.Arrays;

public class Basic078 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to test that a given array of integers 
		 * of length 2 contains a 4 or a 7. 
			Sample Output:
			
			Original Array: [5, 7]                                                 
			true 
		 */

		int[] originalArray = {5, 7};
		boolean resultBoolean = false;
		
		for (int i : originalArray) {
			if (i == 4 || i == 7) {
				resultBoolean = true;
				break;
			}
		}
		System.out.println("Original Array: " + Arrays.toString(originalArray));
		System.out.println(resultBoolean);
	}

}
