package com.w3resources.java.exercises.java.basic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Basic047 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to display the current date time in specific format.
			Sample Output:
			
			Now: 2017/06/16 08:52:03.066 

		 */

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");
		LocalDateTime nowDateTime = LocalDateTime.now();
		
		System.out.println("Now: " + formatter.format(nowDateTime));
	}

}
