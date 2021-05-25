package com.w3resources.java.exercises.java.basic;

public class Basic120 {
	/*
	 * Write a Java program that searches a value in an m x n matrix.
	 */

	public static void main(String[] args) {
		int[][] multiArr = {{1,2,3},{4,5,6},{7,8,9}};
		int lookingFor = 5;
		for (int i = 0; i < multiArr.length; i++) {
			for (int j = 0; j < multiArr[i].length; j++) {
				if (multiArr[i][j] == lookingFor) {
					System.out.println("Found " + lookingFor + " at " + i + "," + j);
				}
			}
		}
	}

}
