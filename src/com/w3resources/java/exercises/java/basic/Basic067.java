package com.w3resources.java.exercises.java.basic;

public class Basic067 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to insert a word in the middle of the another string.
Insert "Tutorial" in the middle of "Python 3.0", so result will be Python Tutorial 3.0
Sample Output:

Python Tutorial 3.0
		 */
		
		String myString = "Python 3.0";
		String[] mySplitStrings = myString.split(" ");
		
		System.out.println(String.join(" Tutorial ", mySplitStrings));
	}

}
