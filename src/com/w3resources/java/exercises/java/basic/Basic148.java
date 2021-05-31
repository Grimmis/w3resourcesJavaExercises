package com.w3resources.java.exercises.java.basic;

public class Basic148 {
	/*
	 * Write a Java program to find the index of the first unique character in a 
	 * given string, assume that there is at least one unique character in the string.
		Sample Output:
		Original String: wresource
		First unique character of the above: 0
	 */
	private static int firstUnique(String input) throws Exception{
		char[] inputChars = input.toCharArray();
		int n = inputChars.length;
		for (int i = 0; i < n; i++) 
			for (int j = 0; j < n; j++) 
				if (i == j)
					continue;
				else if (inputChars[i] == inputChars[j])
					break;
				else if (j == n - 1)
					return i;
		throw new Exception("Input String does not contain a unique character.");
	}
	
	private static void print148(String input) {
		int index = 0;
		System.out.println("String: " + input);
		try {
			index = firstUnique(input);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("First unique character at index: " + index);
		}
	}
	
	public static void main(String[] args) {
		String test = "wresource";
		print148(test);
		String test2 = "abouaou";
		print148(test2);
		String test3 = "abcdZabcd";
		print148(test3);
		String fail = "abcdabcd";
		print148(fail);
	}

}
