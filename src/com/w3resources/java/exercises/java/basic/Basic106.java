package com.w3resources.java.exercises.java.basic;

public class Basic106 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to create a new array that is 
		 * left shifted from a given array of integers. 
		 */

		int[] array1 = new int[] {0, 1, 2, 3, 4, 5};
		int[] array2 = new int[array1.length];
		
		int pocket = array1[0];
		for (int i = 1; i < array1.length; i++) {
			array2[i - 1] = array1[i];
		}
		array2[array1.length - 1] = pocket;
		
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i]);
		}
	}

}
