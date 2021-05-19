package com.w3resources.java.exercises.java.basic;

import java.util.Calendar;

public class Basic046 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to display the system time.
			Sample Output:
			
			Current Date time: Fri Jun 16 14:17:40 IST 2017 
		 */
		
		System.out.format("\nCurrent Date time: " + Calendar.getInstance().getTime());
		
	}

}
