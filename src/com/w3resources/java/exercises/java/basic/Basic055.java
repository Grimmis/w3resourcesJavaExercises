package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic055 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to convert seconds to hour, minute and seconds.
			Sample Output:
			
			Input seconds: 86399                                                   
			23:59:59
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input seconds: ");
		int inputSeconds = scanner.nextInt();
		
		int rawMinutes = inputSeconds / 60;
		int seconds = inputSeconds % 60;
		int hours = rawMinutes / 60;
		int minutes = rawMinutes % 60;
		
		System.out.println(hours + ":" + minutes + ":" + seconds);
		
		scanner.close();
	}

}
