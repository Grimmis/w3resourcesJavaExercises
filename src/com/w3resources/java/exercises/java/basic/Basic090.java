package com.w3resources.java.exercises.java.basic;

public class Basic090 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to get the value of the environment 
		 * variable PATH, TEMP, USERNAME. 
		 */

		String pathString = System.getenv().get("PATH");
		System.out.println("PATH: " + pathString);
		
		String tempString = System.getenv().get("TEMP");
		System.out.println("TEMP: " + tempString);
		
		String usernameString = System.getenv().get("USERNAME");
		System.out.println("USERNAME: " + usernameString);
	}

}
