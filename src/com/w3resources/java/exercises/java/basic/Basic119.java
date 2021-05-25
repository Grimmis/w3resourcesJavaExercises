package com.w3resources.java.exercises.java.basic;

public class Basic119 {
	/*
	 * Write a Java program to get the first occurrence 
	 * (Position starts from 0.) of an element of a given array.
	 */
	public static void main(String[] args) {
		int[] input = {5, 4, 3, 8, 7, 6, 9, 3, 5};
		int lookingFor = 3;
		for (int i = 0; i < input.length; i++) {
			if (input[i] == lookingFor) {
				System.out.println("First occurance of " + lookingFor + " at index: " + i);
				return;
			}
		}
		System.out.println(lookingFor + " was not in the given array.");
		return;
	}

}
