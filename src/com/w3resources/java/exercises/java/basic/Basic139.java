package com.w3resources.java.exercises.java.basic;

public class Basic139 {
	/*
	 * Write a Java program to get the index of the first number and the last 
	 * number of a subarray where the sum of numbers is zero from a given array 
	 * of integers. Go to the editor
		Original Array : [1, 2, 3, -6, 5, 4]
		Index of the subarray of the said array where the sum of numbers is zero: [0, 3]
	 */
	private static int[] getSubArraySumZero(int[] inputArr) {
		int n = inputArr.length, sum = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = i; k <= j; k++)
					sum += inputArr[k];
				if (sum == 0)
					return new int[] {i, j};
				sum = 0;
			}
		}
		return new int[] {0, 0};
	}
	
	private static void print139(int[] inputArr) {
		int[] subArr = getSubArraySumZero(inputArr);
		System.out.println("[" + subArr[0] + ", " + subArr[1] + "]");
	}
	
	public static void main(String[] args) {
		int[] test = new int[] {1, 2, 3, -6, 5, 4};
		print139(test);
	}

}
