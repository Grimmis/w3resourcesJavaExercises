package com.w3resources.java.exercises.java.basic;

public class Basic013 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to print the area and perimeter of a rectangle.
			Test Data:
			Width = 5.6 Height = 8.5
			
			Expected Output
			Area is 5.6 * 8.5 = 47.60
			Perimeter is 2 * (5.6 + 8.5) = 28.20 
		 */
		
		double rectangleWidth = 5.6;
		double rectangleHeight = 8.5;
		
		double rawArea = rectangleWidth * rectangleHeight;
		double rawParimeter = 2 * (rectangleWidth + rectangleHeight);

		System.out.printf("Area is 5.6 * 8.5 = %.2f\n", rawArea);
		System.out.printf("Perimeter is 2 x (5.6 + 8.5) = %.2f\n", rawParimeter);

	}

}
