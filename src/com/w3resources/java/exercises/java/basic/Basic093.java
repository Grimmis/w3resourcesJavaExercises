package com.w3resources.java.exercises.java.basic;

import java.util.Arrays;

public class Basic093 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to rearrange all the elements of a given array 
		 * of integers so that all the odd numbers come before all the even numbers.
		 */
		
		int[] originalArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(originalArr));
		int[] oddBeforeEven = new int[originalArr.length];
		int j = 0;
		for (int i = 0; i < originalArr.length; i++) {
			if (originalArr[i] % 2 == 1 && j < originalArr.length) {
				oddBeforeEven[j] = originalArr[i];
				j++;
			}
		}
		for (int i = 0; i < originalArr.length; i++) {
			if (originalArr[i] % 2 == 0 && j < originalArr.length) {
				oddBeforeEven[j] = originalArr[i];
				j++;
			}
		}
		
		System.out.println(Arrays.toString(oddBeforeEven));
	}

}
