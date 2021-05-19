package com.w3resources.java.exercises.java.basic;

public class Basic085 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to check if a string starts with 
		 * a specified word.
			Sample Data: string1 = "Hello how are you?"
			Sample Output:
			
			true
		 */

		String string1 = "Hello how are you?";
		String prefix = "Hello";
		
		boolean result = string1.startsWith(prefix);

		System.out.println(result);
	}

}
