package com.w3resources.java.exercises.java.basic;

public class Basic115 {

	public static boolean isPalindrome(int n) {
		 char[] nChars = Integer.toString(n).toCharArray();
		 for (int i = 0, j = nChars.length - 1; i < nChars.length; i++, j--) {
			 if (nChars[i] != nChars[j]) {
				 return false;
			 }
		 }
		 return true;
	}
	
	public static void main(String[] args) {
		int input1 = 151, input2 = 243;
		System.out.println(isPalindrome(input1));
		System.out.println(isPalindrome(input2));
		return;
	}

}
