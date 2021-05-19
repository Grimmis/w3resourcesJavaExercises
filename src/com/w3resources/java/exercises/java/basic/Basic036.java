package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic036 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to compute the distance between two points on the surface of earth.
			Distance between the two points [ (x1,y1) & (x2,y2)]
			d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
			Radius of the earth r = 6371.01 Kilometers
			Input Data:
			Input the latitude of coordinate 1: 25
			Input the longitude of coordinate 1: 35
			Input the latitude of coordinate 2: 35.5
			Input the longitude of coordinate 2: 25.5
			Expected Output
			
			The distance between those points is: 1480.0848451069087 km 
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the latitude of coordinate 1: ");
		double latitudeA = scanner.nextDouble();
		System.out.print("Input the longitude of coordinate 1: ");
		double longitudeA = scanner.nextDouble();
		System.out.print("Input the latitude of coordinate 2: ");
		double latitudeB = scanner.nextDouble();
		System.out.print("Input the longitude of coordinate 2: ");
		double longitudeB = scanner.nextDouble();
		
		double radiusOfEarth = 6371.01;
		
		double distanceOnSurfaceOfEarth = radiusOfEarth * Math.acos(Math.sin(latitudeA) * Math.sin(latitudeB) + Math.cos(latitudeA) * Math.cos(latitudeB) * Math.cos(longitudeA - longitudeB));
		System.out.println("The distance between those points is: " + distanceOnSurfaceOfEarth + "km");
		
		scanner.close();
		
		// Bad equation or bad answer given...
		System.out.println("Something went wrong...");
	}

}
