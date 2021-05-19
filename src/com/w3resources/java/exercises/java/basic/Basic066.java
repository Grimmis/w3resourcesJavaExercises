package com.w3resources.java.exercises.java.basic;

public class Basic066 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to compute the sum of the first 100 prime numbers.
			Sample Output:
			
			Sum of the first 100 prime numbers: 24133 
		 */
		
		int sumOfPrimes = 5;
		int numOfPrimes = 2;
		int index = 5;
		
		while (numOfPrimes < 100) {
			for (int j = 2; j < Math.floor(index / 2); j++) {
				if (index % j == 0) {
					break;
				} else if (j == Math.floor(index / 2) - 1) {
					sumOfPrimes += index;
					numOfPrimes++;
					System.out.println(index);
				}
			}
			if (numOfPrimes == 100) {
				sumOfPrimes -= index;
			}
			index++;
		}
		
		System.out.println("Sum of the first 100 prime numbers: " + sumOfPrimes);
		
	}

}
