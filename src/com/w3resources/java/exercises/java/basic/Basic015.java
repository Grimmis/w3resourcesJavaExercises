package com.w3resources.java.exercises.java.basic;

public class Basic015 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to swap two variables.
		 */
		
		int variableOne = 1;
		int variableTwo = 2;
		
		System.out.println("Variable One: " + variableOne);
		System.out.println("Variable Two: " + variableTwo);
		
		int temporaryVariable = 0;
		
		System.out.println("\nSwapping Variables...\n");
		
		temporaryVariable = variableOne;
		variableOne = variableTwo;
		variableTwo = temporaryVariable;
		
		System.out.println("Variable One: " + variableOne);
		System.out.println("Variable Two: " + variableTwo);
		
		temporaryVariable = 0;
		
	}

}
