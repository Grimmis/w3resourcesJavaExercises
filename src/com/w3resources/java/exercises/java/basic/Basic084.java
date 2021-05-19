package com.w3resources.java.exercises.java.basic;

public class Basic084 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to take the last three characters from 
		 * a given string and add the three characters at both the front 
		 * and back of the string. String length must be greater than 
		 * three and more.
			Test data: "Python" will be "honPythonhon"
			Sample Output:
			
			honPythonhon
		 */

		String testString =  "Python";
		int howManyLast = 3;
		if (testString.length() < howManyLast) {
			throw new Error("String length must be greater than or equal to " + howManyLast + ".");
		}
		
		String last3String = testString.substring(testString.length() - howManyLast);
		String resultString = last3String + testString + last3String;
		
		System.out.println(resultString);
	}

}
