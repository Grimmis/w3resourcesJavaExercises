package com.w3resources.java.exercises.java.basic;

public class Basic110 {
	
	private static boolean isPowOfFour(int n) {
		int PowOfFour = 4;
		while (PowOfFour <= n) {
			if (PowOfFour == n) {
				return true;
			} else {
				PowOfFour *= 4;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		//int input = 65;
		int input = 64;
		boolean result = isPowOfFour(input);
		System.out.println(result);
		return;
	}

}
