package com.w3resources.java.exercises.java.basic;

public class Basic056 {

	public static void main(String[] args) {
		/*
		 *  Write a Java program to find the number of integers within the range 
		 *  of two specified numbers and that are divisible by another number.
			For example x = 5, y=20 and p =3, find the number of integers within 
			the range x..y and that are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }
			Sample Output:
			
			5
		 */
		
		int x = 5, y = 20, p = 3;
		if (x > y) {
			throw new Error("x > y: x must be less than y.");
		}
		
		int count = 0;
		for (int i = x; i < y; i++) {
			if (i % p == 0) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
