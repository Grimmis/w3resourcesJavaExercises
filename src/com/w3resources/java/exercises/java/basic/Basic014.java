package com.w3resources.java.exercises.java.basic;

public class Basic014 {

	public static void main(String[] args) {
		/*
		 *  Write a Java program to print an American flag on the screen. Go to the editor
			Expected Output
			
			* * * * * * ==================================                          
			 * * * * *  ==================================                          
			* * * * * * ==================================                          
			 * * * * *  ==================================                          
			* * * * * * ==================================                          
			 * * * * *  ==================================                          
			* * * * * * ==================================                          
			 * * * * *  ==================================                          
			* * * * * * ==================================                          
			==============================================                          
			==============================================                          
			==============================================                          
			==============================================                          
			==============================================                          
			==============================================
		 */
		String[] flagStrings = new String[15];
		
		for (int i = 0; i < flagStrings.length; i++) {
			flagStrings[i] = "";
			for (int j = 0; j < 48; j++) {
				flagStrings[i] = flagStrings[i] + "="; 
			}
		}
		
		for (int i = 0; i < 9; i += 2) {
			for (int j = 0; j < 12; j++) {
				StringBuilder tempBuilder = new StringBuilder(flagStrings[i]);
				if (j % 2 == 0) {
					tempBuilder.setCharAt(j, '*');
				} else {
					tempBuilder.setCharAt(j, ' ');
				}
				flagStrings[i] = tempBuilder.toString();
			}
		}
		
		for (int i = 1; i < 9; i += 2) {
			for (int j = 0; j < 12; j++) {
				StringBuilder tempBuilder = new StringBuilder(flagStrings[i]);
				if (j % 2 != 0 && j != 11) {
					tempBuilder.setCharAt(j, '*');
				} else {
					tempBuilder.setCharAt(j, ' ');
				}
				flagStrings[i] = tempBuilder.toString();
			}
		}
		
		for (int i = 0; i < flagStrings.length; i++) {
			System.out.println(flagStrings[i]);
		}
	}
}