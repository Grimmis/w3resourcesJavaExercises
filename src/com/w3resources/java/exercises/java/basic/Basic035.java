package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic035 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to compute the area of a polygon. 
			Area of a polygon = (n*s^2)/(4*tan(π/n))
			where n is n-sided polygon and s is the length of a side
			Input Data:
			Input the number of sides on the polygon: 7
			Input the length of one of the sides: 6
			Expected Output
			
			The area is: 130.82084798405722
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the number of sides on the polygon: ");
		int inputNumberOfSides = scanner.nextInt();
		System.out.print("Input the length of one of the sides: ");
		double inputLengthOfSides = scanner.nextDouble();
		
		double areaOfPolygon = (inputNumberOfSides * Math.pow(inputLengthOfSides, 2)) / (4 * Math.tan(Math.PI / inputNumberOfSides));
		System.out.println("The area is: " + areaOfPolygon);
		
		scanner.close();
	}

}
