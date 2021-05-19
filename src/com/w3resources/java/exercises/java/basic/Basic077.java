package com.w3resources.java.exercises.java.basic;

import java.util.Arrays;

public class Basic077 {

	public static void main(String[] args) {
		/*
		 *  Write a Java program to create a new array of length 2 from 
		 *  two arrays of integers with three elements and the new array 
		 *  will contain the first and last elements from the two arrays. Go to the editor
			Test Data: array1 = 50, -20, 0
			array2 = 5, -50, 10
			Sample Output:
			
			Array1: [50, -20, 0]                                                   
			Array2: [5, -50, 10]                                                   
			New Array: [50, 10]
		 */
		
		int[] array1 = {50, -20, 0};
		System.out.println("Array1: " + Arrays.toString(array1));
		int[] array2 = {5, -50, 10};
		System.out.println("Array1: " + Arrays.toString(array2));
		int[] arrayNew = new int[2];
		
		arrayNew[0] = array1[0];
		arrayNew[1] = array2[2];
		System.out.println("New Array: " + Arrays.toString(arrayNew));
	}

}
