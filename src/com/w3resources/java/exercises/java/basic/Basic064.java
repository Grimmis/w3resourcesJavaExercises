package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic064 {

	public static void main(String[] args) {
		/*
		 * Write a Java program that accepts two integer values 
		 * between 25 to 75 and return true if there is a common 
		 * digit in both numbers.
			Sample Output:
			
			Input the first number : 35                                            
			Input the second number: 45                                            
			Result: true
		 */

		Scanner inScanner = new Scanner(System.in);
		System.out.print("Input the first number : ");
		String inputStringOne = inScanner.nextLine();
		System.out.print("Input the second number: ");
		String inputStringTwo = inScanner.nextLine();
		boolean result = false;
		
		if (Integer.parseInt(inputStringOne) < 25
				|| Integer.parseInt(inputStringOne) > 75
				|| Integer.parseInt(inputStringTwo) < 25
				|| Integer.parseInt(inputStringTwo) > 75) {
			inScanner.close();
			throw new Error("Expected Integer between 25 and 75.");
		}
		
		if (inputStringOne.charAt(0) == inputStringTwo.charAt(0)
				|| inputStringOne.charAt(0) == inputStringTwo.charAt(1)
				|| inputStringOne.charAt(1) == inputStringTwo.charAt(0)
				|| inputStringOne.charAt(1) == inputStringTwo.charAt(1)) {
			result = true;
		}
		
		System.out.println("Result: " + result);
		
		inScanner.close();
	}

}
