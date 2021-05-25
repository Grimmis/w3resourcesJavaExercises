package com.w3resources.java.exercises.java.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Basic118 {
	/*
	 * Write a Java program to get the first occurrence 
	 * (Position starts from 0.) of a string within a given string.
	 */
	
	public static void main(String[] args) {
		String inputString = "I like Java in the morning.";
		System.out.println(inputString);
		String patternString = "[J|j]ava";
		Pattern pattern = Pattern.compile(patternString);
		System.out.println("Finding first occurance of " + patternString + ": ");
		Matcher matcher = pattern.matcher(inputString);
		if (matcher.find()) {
			System.out.print("Found: " + matcher.group(0) + " at index " + matcher.start(0));
		} else {
			System.out.println("No Match");
		}
		return;
	}

}
