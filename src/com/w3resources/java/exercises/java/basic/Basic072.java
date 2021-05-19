package com.w3resources.java.exercises.java.basic;

public class Basic072 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to create a new string taking the first three
		 * characters from a given string. If the length of the given string
		 * is less than 3 use "#" as substitute characters.
			Test Data: Str1 = " "
			Sample Output: 
			
			###
		 */

		String str1 = " ";
		
		String checkedStr1 = "";
		for (int i = 0; i < str1.length(); i++) {
			if (Character.isSpaceChar(str1.charAt(i))) {
				checkedStr1 += "#";
			} else {
				checkedStr1 += str1.charAt(i);
			}
		}
		while (checkedStr1.length() < 3) {
			checkedStr1 += "#";
		}
		
		System.out.println(checkedStr1);
	}

}
