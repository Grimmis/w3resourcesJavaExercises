package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic062 {

	public static void main(String[] args) {
		/*
		 * Write a Java program that accepts three integer values and 
		 * return true if one of them is 20 or more and less than the 
		 * substractions of others.
			Sample Output:
			
			Input the first number : 15                                            
			Input the second number: 20                                            
			Input the third number : 25                                            
			false
		 */
		
		Scanner inScanner = new Scanner(System.in);
		System.out.print("Input the first number  : ");
		int inputIntOne = inScanner.nextInt();
		System.out.print("Input the second number : ");
		int inputIntTwo = inScanner.nextInt();
		System.out.print("Input the third number  : ");
		int inputIntThree = inScanner.nextInt();
		
		Boolean resultBoolean = false;
		if (inputIntOne > 20) {
			if (inputIntOne < inputIntTwo - inputIntThree
					|| inputIntOne < inputIntThree - inputIntTwo) {
				resultBoolean = true;
			}
		} else if (inputIntTwo > 20) {
			if (inputIntTwo < inputIntOne - inputIntThree
					|| inputIntTwo < inputIntThree - inputIntOne) {
				resultBoolean = false;
			}
		} else if (inputIntThree > 20) {
			if (inputIntThree < inputIntOne - inputIntTwo
					|| inputIntThree < inputIntTwo - inputIntOne) {
				resultBoolean = false;
			}
		}
		
		System.out.println(resultBoolean);
		
		inScanner.close();
	}

}
