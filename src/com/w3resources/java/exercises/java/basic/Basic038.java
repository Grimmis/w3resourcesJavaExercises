package com.w3resources.java.exercises.java.basic;

public class Basic038 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to count the letters, spaces, numbers and other characters 
		 * of an input string.
			Expected Output
			
			The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
			letter: 23                                               
			space: 9                                                 
			number: 10                                               
			other: 6
		 */

		String string =  "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		char c;
		int letters = 0, spaces = 0, numbers = 0, others = 0;
		
		for (int i = 0; i < string.length(); i++) {
			c = string.charAt(i);
			if (Character.isAlphabetic(c)) {
				letters++;
			} else if (Character.isSpaceChar(c)) {
				spaces++;
			} else if (Character.isDigit(c)) {
				numbers++;
			} else {
				others++;
			}
		}
		
		System.out.println("The string is : " + string);
		System.out.println("letter: " + letters);
		System.out.println("space: " + spaces);
		System.out.println("number: " + numbers);
		System.out.println("other: " + others);
	}

}
