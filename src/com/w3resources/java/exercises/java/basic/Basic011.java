package com.w3resources.java.exercises.java.basic;

public class Basic011 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to print the area and perimeter of a circle.
			Test Data:
			Radius = 7.5
			Expected Output
			Perimeter is = 47.12388980384689
			Area is = 176.71458676442586
		 */
		double radius = 7.5;
		double circlePerimeter = 2 * Math.PI * radius;
		double circleArea = Math.PI * Math.pow(radius, 2);
		
		System.out.println("Perimeter is = " + circlePerimeter);
		System.out.println("Area is = " + circleArea);

	}

}
