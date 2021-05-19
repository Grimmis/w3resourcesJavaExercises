package com.w3resources.java.exercises.java.basic;

import java.util.Arrays;

public class Basic080 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to get the larger value between first and 
		 * last element of an array (length 3) of integers .
			Sample Output:
			
			Original Array: [20, 30, 40]                                           
			Larger value between first and last element: 40 
		 */

		int[] originalArray = {20, 30, 40};
		int largerInt = (originalArray[0] > originalArray[originalArray.length - 1]) ?
				originalArray[0] :
				originalArray[originalArray.length - 1];
		
		System.out.println("Original Array " + Arrays.toString(originalArray));
		System.out.println("Larger value between first and last element: " + largerInt);
	}

}
