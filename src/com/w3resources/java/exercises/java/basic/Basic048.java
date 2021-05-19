package com.w3resources.java.exercises.java.basic;

public class Basic048 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to print the odd numbers from 1 to 99. Prints one number per line.
			Sample Output:
			
			1                                                                      
			3                                                                      
			5                                                                      
			7                                                                      
			9                                                                      
			11                                                                     
			....                                                                     
			                                                                    
			91                                                                     
			93                                                                     
			95                                                                     
			97                                                                     
			99 
		 */

		for (int i = 1; i <= 99; i += 2) {
			System.out.println(i);
		}
	}

}
