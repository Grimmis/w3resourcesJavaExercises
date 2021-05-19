package com.w3resources.java.exercises.java.basic;

import java.util.Scanner;

public class Basic060 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to find the penultimate (next to last) word of a sentence. Go to the editor
			Sample Output:
			
			Input a String: The quick brown fox jumps over the lazy dog.
			Penultimate word: lazy
		 */
		
		Scanner inScanner = new Scanner(System.in);
		System.out.print("Input a String: ");
		String inputString = inScanner.nextLine();
		Scanner stringScanner = new Scanner(inputString);
		String lastWordString = "";
		String nextToLastWordString = "";
		while (stringScanner.hasNext()) {
			nextToLastWordString = lastWordString;
			lastWordString = stringScanner.next();
		}
		
		System.out.println("Penultimate word: " + nextToLastWordString);
		
		stringScanner.close();
		inScanner.close();
	}

}
