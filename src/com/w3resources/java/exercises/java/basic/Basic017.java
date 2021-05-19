package com.w3resources.java.exercises.java.basic;

public class Basic017 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to add two binary numbers.
			Input Data:
			Input first binary number: 10
			Input second binary number: 11
			Expected Output
			
			Sum of two binary numbers: 101
		 */
		
		int binaryOne = 0b10;
		int binaryTwo = 0b11;
		
		int sumOfBinaryNumbersAsInt = binaryOne + binaryTwo;
		String sumOfBinaryNumbers = Integer.toBinaryString(sumOfBinaryNumbersAsInt);
		
		System.out.println("Sum of two binary numbers: " + sumOfBinaryNumbers);
	}

}
