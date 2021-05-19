package com.w3resources.java.exercises.java.basic;

public class Basic091 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to measure how long some code takes to execute in nanoseconds.
		 */

		long startTime = System.nanoTime();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
		
		long endTime = System.nanoTime() - startTime;
		System.out.println(endTime);
	}

}
