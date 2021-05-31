package com.w3resources.java.exercises.java.basic;

public class Basic141 {
	/*
	 * Write a Java program to check if a given string has 
	 * all unique characters.
		Sample Output: Original String : xyyz
		String has all unique characters: false
	 */
	
	private static boolean alllUniqueCharacters(String inputString) {
		char[] workingChars = inputString.toCharArray();
		int n = workingChars.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (workingChars[i] == workingChars[j])
					return false;
			}
		}
		return true;
	}
	
	private static void print141(String inputString) {
		System.out.println("Original String: " + inputString);
		boolean result = alllUniqueCharacters(inputString);
		System.out.println("String is all unique characters: " + result);
		System.out.println();
	}
	
	public static void main(String[] args) {
		String test1 = "xyyz";
		print141(test1);
		String test2 = "abcd";
		print141(test2);
	}

}
