package com.w3resources.java.exercises.java.basic;

public class Basic096 {

	public static void main(String[] args) {
		/*
		 *  Write a Java program to test if an array of integers contains 
		 *  an element 10 next to 10 or an element 20 next to 20, but not both.
		 */

		int[] testArr = new int[] {0, 10, 1, 20, 20};
		boolean has10s = false, has20s = false, result = false;
		
		int last = testArr[0];
		for (int i : testArr) {
			if (i == 10 && last == 10) {
				has10s = true;
			} else if (i == 20 && last == 20) {
				has20s = true;
			}
			last = i;
		}
		
		if ((has10s || has20s) && !(has10s && has20s)) {
			result = true;
		}
		
		System.out.println(result);
	}

}
