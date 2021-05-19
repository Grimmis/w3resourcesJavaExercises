package com.w3resources.java.exercises.java.basic;

public class Basic069 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to extract the first half of a string of even length.
			Test Data: Python
			Sample Output:
			
			Pyt
		 */

		String myString = "Python";
		char[] myChars = myString.toCharArray();
		if (myChars.length % 2 != 0) {
			throw new Error("Expected string of even length...");
		}
		String firstHalfString = "";
		for (int i = 0; i < myChars.length / 2; i++) {
			firstHalfString += myChars[i];
		}
		
		System.out.println(firstHalfString);
	}

}
