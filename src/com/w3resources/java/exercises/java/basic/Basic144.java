package com.w3resources.java.exercises.java.basic;

import java.util.ArrayList;

public class Basic144 {
	/*
	 * Write a Java program to remove all occurrences of a specified 
	 * value in a given array of integers and return the new length 
	 * of the array.
		Sample Output:
		Original array: [1, 4, 6, 7, 6, 2]
		The length of the new array is: 4
	 */
	private static int removeAll(int[] inputArray, int toBeRemoved) {
		ArrayList<Integer> workingArrayList = new ArrayList<>();
		for (int i = 0; i < inputArray.length; i++) 
			if (inputArray[i] != toBeRemoved) 
				workingArrayList.add(inputArray[i]);
		return workingArrayList.size();
	}
	
	private static String arrayToString(int[] input) {
		int n = input.length - 1;
		String outputString = "[";
		for (int i = 0; i < n; i++) 
			outputString += input[i] + ", ";
		outputString += input[n] + "]";
		return outputString;
	}
	
	private static void print144(int[] inputArray, int toBeRemoved) {
		System.out.println(arrayToString(inputArray));
		System.out.println(removeAll(inputArray, toBeRemoved));
	}
	
	public static void main(String[] args) {
		int[] test1 = new int[] {1, 4, 6, 7, 6, 2};
		print144(test1, 6);
	}

}
