package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic034 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to compute the area of a hexagon.
			Area of a hexagon = (6 * s^2)/(4*tan(π/6))
			where s is the length of a side
			Input Data:
			Input the length of a side of the hexagon: 6
			Expected Output
			
			The area of the hexagon is: 93.53074360871938
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the length of a side of the hexagon: ");
		double inputLength = scanner.nextDouble();
		
		double areaOfHexagon = (6 * Math.pow(inputLength, 2)) / (4 * Math.tan(Math.PI/6));
		System.out.println("The area of the hexagon is: " + areaOfHexagon);
		
		scanner.close();
	}

}
