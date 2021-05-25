package com.w3resources.java.exercises.java.basic;

public class Basic114 {

	public static String rotateString(String inputString, int offset) {
		String output = inputString.substring(offset, inputString.length()) + inputString.substring(0, offset);
		return output;
	}
	
	public static void main(String[] args) {
		String inputString = "Hello, World!";
		int inputOffset = 4;
		try {
			System.out.println(rotateString(inputString, inputOffset));
		} catch (Exception e) {
			System.err.println(e);
		}
		return;
	}

}
