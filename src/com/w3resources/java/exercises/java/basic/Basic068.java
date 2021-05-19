package com.w3resources.java.exercises.java.basic;

public class Basic068 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to create a new string of 4 copies of the
		 * last 3 characters of the original string. The length of the 
		 * original string must be 3 and above.
			Sample Output:
			
			3.03.03.03.0 
		 */

		String myString = "Test";
		char[] myChars = myString.toCharArray();
		if (myChars.length < 3) {
			throw new Error("Input must be greater or equal to 3...");
		}
		String last3String = "";
		for (int i = myChars.length - 3; i < myChars.length; i++) {
			last3String += myChars[i];
		}
		String last3time4String = last3String;
		for (int i = 0; i < 3; i++) {
			last3time4String += last3String;
		}
		
		System.out.println(last3time4String);
	}

}
