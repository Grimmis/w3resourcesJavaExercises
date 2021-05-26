package com.w3resources.java.exercises.java.basic;

public class Basic129 {
	/*
	 * Write a Java program to find a number that appears only once in a 
	 * given array of integers, all numbers occur twice.
		Source Array : [10, 20, 10, 20, 30, 40, 40, 30, 50] 50 appears only once
	 */
	private static boolean occursOnceInArr(int[] inputArr, int index) throws Exception {
		if (inputArr.length < 1) {
			throw new Exception("Array is empty.");
		}
		for (int i = 0; i < inputArr.length; i++) {
			if (i != index && inputArr[i] == inputArr[index]) {
				return false;
			}
		}
		return true;
	}
	
	private static int findElementThatOccursOnceInArr(int[] inputArr) throws Exception {
		for (int i = 0; i < inputArr.length; i++) {
			if (occursOnceInArr(inputArr, i)) {
				return inputArr[i];
			}
		}
		throw new Exception("No unique elements in array.");
	}
	
	public static void main(String[] args) {
		int[] test = {10, 20, 10, 20, 30, 40, 40, 30, 50};
		try {
			System.out.println(findElementThatOccursOnceInArr(test));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
