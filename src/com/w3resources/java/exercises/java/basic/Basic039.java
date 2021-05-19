package com.w3resources.java.exercises.java.basic;

public class Basic039 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to create and display unique three-digit number using 1, 2, 3, 4. 
		 * Also count how many three-digit numbers are there.
			Expected Output
			
			123                                                      
			124                                                      
			...                                            
			                                                   
			431                                                      
			432                                                      
			Total number of the three-digit-number is 24
		 */

		int total = 0;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				for (int k = 1; k <= 4; k++) {
					total++;
					System.out.print(i);
					System.out.print(j);
					System.out.println(k);
				}
			}
		}
		
		System.out.println("Total number of the three-digit-number is " + total);
		// Expected total does not match.
	}

}
