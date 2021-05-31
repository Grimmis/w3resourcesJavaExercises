package com.w3resources.java.exercises.java.basic;

public class Basic145 {
	/*
	 * Write a Java program to remove the nth element from 
	 * the end of a given list.
		Sample Output:
		Original node:
		1 2 3 4 5
		After removing 2nd element from end:
		1 2 3 5 
	 */
	private static int[] removeNthElementFromEnd(int[] input, int nth) {
		int l = input.length;
		int remove = l - nth;
		int[] output = new int[l - 1];
		for (int i = 0; i < l - 1; i++) 
			output[i] = (i < remove) ? input[i] : input[i + 1];
		return output;
	}
	
	private static String arrayToString(int[] input) {
		int n = input.length - 1;
		String output = "[";
		for (int i = 0; i < n; i++) 
			output += input[i] + ", ";
		return output + input[n] + "]";
	}
	
	private static void print145(int[] input, int nth) {
		System.out.println(arrayToString(input));
		System.out.println("Removing element " + nth + " from the last.");
		System.out.println(arrayToString(removeNthElementFromEnd(input, nth)));
	}
	
	public static void main(String[] args) {
		print145(new int[] {1, 2, 3, 4, 5}, 2);
	}

}
