package com.w3resources.java.exercises.java.basic;

import java.util.Arrays;

public class Basic081 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to swap the first and last elements 
		 * of an array (length must be at least 1) and create a new array.
			Sample Output:
			
			Original Array: [20, 30, 40]                                           
			New array after swapping the first and last elements: [40, 30, 20] 
		 */

		int[] originalArray = {20, 30, 40};
		int[] newArray = new int[originalArray.length];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = originalArray[i];
		}
		newArray[0] = originalArray[originalArray.length - 1];
		newArray[originalArray.length - 1] = originalArray[0];
		
		System.out.println("Original Array: " + Arrays.toString(originalArray));
		System.out.println(
				"New array after swapping the first and last elements: " 
				+ Arrays.toString(newArray));
	}

}
