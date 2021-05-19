package com.w3resources.java.exercises.java.basic;

public class Basic073 {
	
	private static String checkString73(String str) {
		String checkedString = str;
		if (str.length() < 1
				| str.charAt(str.length() - 1) == ' ') {
			checkedString = "#";
		}
		return checkedString;
	}

	public static void main(String[] args) {
		/*
		 * Write a Java program to create a new string taking first 
		 * and last characters from two given strings. If the length 
		 * of either string is 0 use "#" for missing character.
			Test Data: str1 = "Python"
			str2 = " "
			Sample Output:
			
			P#
		 */
		
		String str1 = "Python";
		String str2 = " ";
		String checkedStr1 = checkString73(str1);
		String checkedStr2 = checkString73(str2);
		
		
		System.out.println(checkedStr1.charAt(0) + "" + checkedStr2.charAt(checkedStr2.length() - 1));
	}

}
