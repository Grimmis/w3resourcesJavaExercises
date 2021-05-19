package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic087 {

	public static void main(String[] args) {
		/*
		 * Write a Java program that reads an integer and calculate 
		 * the sum of its digits and write the number of each digit 
		 * of the sum in English.
		 */

		String[] numberNameStrings = {"zero", "one", "two", "three", 
				"four", "five", "six", "seven", "eight", "nine"};
		System.out.print("Input an integer: ");
		Scanner inScanner = new Scanner(System.in);
		int inputInt;
		try {
			inputInt = inScanner.nextInt();
		} catch (Exception e) {
			throw new Error("Unexpected input: " + e);
		} finally {
			inScanner.close();
		}
		
		String inputIntAsString = Integer.toString(inputInt);
		int sumOfDigits = 0;
		for (char c : inputIntAsString.toCharArray()) {
			sumOfDigits += Integer.parseInt(c + "");
		}
		
		System.out.println("Sum of digits: " + sumOfDigits);
		
		String sumOfDigitsString = Integer.toString(sumOfDigits);
		char[] sumOfDigitsCharArr = sumOfDigitsString.toCharArray();
		int[] sumOfDigitsIntArr = new int[sumOfDigitsCharArr.length];
		for (int i = 0; i < sumOfDigitsCharArr.length; i++) {
			sumOfDigitsIntArr[i] = Integer.parseInt(sumOfDigitsCharArr[i] + "");
		}
		
		for (int i = 0; i < sumOfDigitsIntArr.length; i++) {
			System.out.print(numberNameStrings[sumOfDigitsIntArr[i]] + " ");
		}
		System.out.println("");
		
	}

}
