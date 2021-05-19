package com.w3resources.java.exercises.java.basic;

public class Basic092 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to count the number of even and odd 
		 * elements in a given array of integers.
		 */

		int[] randArrayOfInts = new int[100];
		
		for (int i = 0; i < 100; i++) {
			randArrayOfInts[i] = (int)(Math.random() * 100);
		}
		
		int evenCount = 0;
		int oddCount = 0;
		for (int i : randArrayOfInts) {
			System.out.println(i);
			if (i % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		
		System.out.println("\n");
		System.out.println("Even: " + evenCount);
		System.out.println("Odd: " + oddCount);
	}

}
