package com.w3resources.java.exercises.java.basic;

public class Basic095 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to check if there is a 10 in a given array of 
		 * integers with a 20 somewhere later in the array. 
		 */
		
		int[] myArray = {0, 1, 2, 10, 3, 4, 5, 20, 6, 7, 8};
		@SuppressWarnings("unused")
		boolean has10 = false;
		boolean has20 = false;
		
		for (int i : myArray) {
			if (has10 = true) {
				if (i == 20) {
					has20 = true;
				}
			}  else if (i == 10) {
				has10 = true;
			}
		}
		
		System.out.println(has20);
	}

}
