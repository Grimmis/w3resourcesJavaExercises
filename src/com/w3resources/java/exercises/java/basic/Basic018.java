package com.w3resources.java.exercises.java.basic;

public class Basic018 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to multiply two binary numbers.
			Input Data:
			Input the first binary number: 10
			Input the second binary number: 11
			Expected Output
			
			Product of two binary numbers: 110 
		 */
		
		int binaryOne = 0b10;
		int binaryTwo = 0b11;
		
		int productOfBinaryNumbersAsInt = binaryOne * binaryTwo;
		String productOfBinaryNumbers = Integer.toBinaryString(productOfBinaryNumbersAsInt);
		
		System.out.println("Product of two binary numbers: " + productOfBinaryNumbers);
		
	}

}
