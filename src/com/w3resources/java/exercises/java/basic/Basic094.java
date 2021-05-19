package com.w3resources.java.exercises.java.basic;

import java.util.Arrays;

public class Basic094 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to create an array (length # 0) of string 
		 * values. The elements will contain "0", "1", "2" … through ... n-1.
		 */

		int n = 20;
		String[] newArr = new String[n];
		
		for (int i = 0; i < n; i++) {
			newArr[i] = Integer.toString(i);
		}
		
		System.out.println(Arrays.toString(newArr));
	}

}
