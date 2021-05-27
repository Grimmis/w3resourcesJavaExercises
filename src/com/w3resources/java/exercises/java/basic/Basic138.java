package com.w3resources.java.exercises.java.basic;

import java.util.ArrayList;

public class Basic138 {
	/*
	 * Write a Java program to find all of the longest word in a 
	 * given dictionary.
		Example-1:
		{
		"cat",
		"flag",
		"green",
		"country",
		"w3resource"
		}
		Result: "w3resource"
		Example-2:
		{
		"cat",
		"dog",
		"red",
		"is",
		"am"
		}
		Result: "cat", "dog", "red"
	 */
	private static String[] findLongestWordInHashMap(String[] dict) {
		ArrayList<String> longestStrings = new ArrayList<>();
		longestStrings.add("");
		for (String s : dict) {
			if (s.length() == longestStrings.get(0).length() && 
					s.length() > 0) {
				longestStrings.add(s);
			} else if (s.length() > longestStrings.get(0).length()) {
				longestStrings = new ArrayList<String>();
				longestStrings.add(s);
			}
		}
		String[] outputStrings = new String[longestStrings.size()];
		for (int i = 0; i < longestStrings.size(); i++)
			outputStrings[i] = longestStrings.get(i);
		return outputStrings;
	}
	
	private static void print138(String[] dict) {
		System.out.println("Result: ");
		String[] longest = findLongestWordInHashMap(dict);
		for (String s : longest) {
			System.out.println(s);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		String[] Example1 = new String[] {
			"cat",
			"flag",
			"green",
			"country",
			"w3resource"
		};
		print138(Example1);
		String[] Example2 = new String[] {
			"cat",
			"dog",
			"red",
			"is",
			"am"
		};
		print138(Example2);
	}

}
