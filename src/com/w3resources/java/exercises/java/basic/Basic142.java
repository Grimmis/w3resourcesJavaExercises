package com.w3resources.java.exercises.java.basic;

import java.util.ArrayList;

public class Basic142 {
	/*
	 * Write a Java program to check if two given strings are 
	 * anagrams or not.
		According to Wikipedia "An anagram is a word or phrase 
		formed by rearranging the letters of a different word 
		or phrase, typically using all the original letters 
		exactly once. For example, the word anagram can be 
		rearranged into nag a ram, or the word binary into 
		brainy."
		Sample Output: String-1 : wxyz
		String-2 : zyxw
		Check if two given strings are anagrams or not?: true
	 */
	private static ArrayList<Character> fromStringToArrayListOfCharacters(String inputString) {
		char[] inputChars = inputString.toCharArray();
		ArrayList<Character> ArrayListOfCharacters = new ArrayList<>();
		for (char c : inputChars)
			ArrayListOfCharacters.add(c);
		return ArrayListOfCharacters;
	}
	
	private static boolean anagrams(String inputString1, String inputString2) {
		ArrayList<Character> input1 = fromStringToArrayListOfCharacters(inputString1);
		ArrayList<Character> input2 = fromStringToArrayListOfCharacters(inputString2);
		if (input1.size() != input2.size())
			return false;
		int i = 0; while (i < input1.size()) {
			int j = 0; while (j < input2.size()) {
				if (input1.get(i) == input2.get(j)) {
					input1.remove(i); input2.remove(j);
					i--; break;
				} 
			j++;} 
		i++;}
		return (input1.size() == 0 && input2.size() == 0) ? true : false;
	}
	
	private static void print142(String inputString1, String inputString2) {
		boolean result = anagrams(inputString1, inputString2);
		System.out.println("Input string 1: " + inputString1);
		System.out.println("Input string 2: " + inputString2);
		System.out.println("Anagrams?: " + result);
		System.out.println();
	}
	
	public static void main(String[] args) {
		print142("wxyz", "yxwz");
		print142("anagram", "nagaram");
		print142("foo", "boo");
	}

}
