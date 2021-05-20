package com.w3resources.java.exercises.java.basic;

public class Basic112 {
	
	private static int factorial(int k) {
		if (k == 1) {
			return 1;
		} else {
			return k * factorial(k - 1);
		}
	}
	
	private static int tailingZeros(int k) {
		String kString = Integer.toString(k);
		int zeroCount = 0;
		for (int i = kString.length() - 1; i >= 0; i--) {
			if (kString.charAt(i) == '0') {
				zeroCount++;
			} else {
				break;
			}
		}
		return zeroCount;
	}

	public static void main(String[] args) {
		int input = 7;
		int factorialOfInput = factorial(input);
		int trailZerosOfFactorial = tailingZeros(factorialOfInput);
		System.out.println(trailZerosOfFactorial);
		return;
	}

}
