package com.w3resources.java.exercises.java.basic;

public class Basic116 {
	/*
	 * Write a Java program which iterates the integers from 1 to 100. 
	 * For multiples of three print "Fizz" instead of the number and print 
	 * "Buzz" for the multiples of five. When number is divided by both 
	 * three and five, print "fizz buzz".
	 */

	public static String fizzBuzz(int n) {
		boolean multOfThree = n % 3 == 0;
		boolean multOfFive = n % 5 == 0;
		if (multOfThree && !multOfFive) {
			return "Fizz";
		} else if (!multOfThree && multOfFive) {
			return "Buzz";
		} else if (multOfThree && multOfFive) {
			return "fizz buzz";
		} else {
			return new String();
		}
	}
	
	public static void main(String[] args) {
		System.out.println(fizzBuzz(9));
		System.out.println(fizzBuzz(10));
		System.out.println(fizzBuzz(15));
		return;
	}

}
