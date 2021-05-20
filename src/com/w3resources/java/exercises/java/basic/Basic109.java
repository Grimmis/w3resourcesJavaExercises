package com.w3resources.java.exercises.java.basic;

import java.util.Vector;

public class Basic109 {
	
	private static Vector<String> createCoinStacks(int k) {
		String nextString;
		Vector<String> outputVector = new Vector<>();
		for (int i = 1; i <= k; i++) {
			nextString = "";
			for (int j = 1; j <= i; j++) {
				nextString = nextString.concat("|");
			}
			outputVector.add(nextString);
		}
		return outputVector;
	}
	
	private static void printCoinStack(Vector<String> vStrings) {
		for (int i = 0; i < vStrings.size(); i++) {
			System.out.println(vStrings.get(i));
		}
		return;
	}

	public static void main(String[] args) {
		int input = 10;
		printCoinStack(createCoinStacks(input));
		return;
	}

}
