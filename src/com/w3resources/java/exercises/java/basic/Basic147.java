package com.w3resources.java.exercises.java.basic;

public class Basic147 {
	/*
	 * Write a Java program to find the number of bits required to flip 
	 * to convert two given integers.
		Sample Output:
		2
	 */
	
	private static int howManyBitFlipsToEqual(int input1, int input2) {
		String binaryString1 = Integer.toBinaryString(input1);
		String binaryString2 = Integer.toBinaryString(input2);
		while (binaryString1.length() < binaryString2.length())
			binaryString1 = "0" + binaryString1;
		while (binaryString2.length() > binaryString2.length())
			binaryString2 = "0" + binaryString2;
		int needsToFlip = 0;
		for (int i = 0; i < binaryString1.length(); i++)
			if (binaryString1.charAt(i) != binaryString2.charAt(i))
				needsToFlip++;
		return needsToFlip;
	}
	
	private static void print147(int input1, int input2) {
		System.out.println(input1 + " in binary: " + Integer.toBinaryString(input1));
		System.out.println(input2 + " in binary: " + Integer.toBinaryString(input2));
		System.out.println("Bits to flip: " + howManyBitFlipsToEqual(input1, input2));
	}
	
	public static void main(String[] args) {
		int test1 = 14;
		int test2 = 29;
		print147(test1, test2);
	}

}
