package com.w3resources.java.exercises.java.basic;

public class Basic070 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to create a string in the form: 
		 * short_string + long_string + short_string 
		 * from two strings. The strings must not have the same length.
			Test Data: Str1 = Python
			Str2 = Tutorial
			Sample Output:
			
			PythonTutorialPython
		 */
		
		String str1 = "Python";
		String str2 = "Tutorial";
		String shortString;
		String longString;
		
		if (str1.length() == str2.length()) {
			throw new Error("Strings must not be equal in length...");
		} else if (str1.length() > str2.length()) {
			shortString = str2;
			longString = str1;
		} else {
			shortString = str1;
			longString = str2;
		}
		System.out.println(shortString + longString + shortString);
	}

}
