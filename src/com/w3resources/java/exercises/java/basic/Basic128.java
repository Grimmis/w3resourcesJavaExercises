package com.w3resources.java.exercises.java.basic;

public class Basic128 {
	/*
	 * Write a Java program to calculate the median of a 
	 * given unsorted array of integers.
	 */
	private static int[] sortIntArray(int[] inputArr) {
		int[] workingArr = inputArr.clone();
		int temp;
		for (int i = 1; i < workingArr.length; i++) {
			if (workingArr[i] < workingArr[i - 1]) {
				temp = workingArr[i];
				workingArr[i] = workingArr[i -  1];
				workingArr[i - 1] = temp;
				return sortIntArray(workingArr);
			}
		}
		return workingArr;
	}
	
	private static double medianOfSortedArray(int[] inputArr) throws Exception {
		int li = inputArr.length - 1, odd = (li + 1) % 2, half = (li + 1) / 2;
		if (li < 0) {
			throw new Exception("Array passed to medianOfSortedArray must be of length greater than 1...");
		} else if (li == 0) {
			return inputArr[0];
		} else if (li == 1) {
			return inputArr[0] / inputArr[1];
		} else if (odd == 1) {
			return inputArr[half];
		} else {
			return (inputArr[half - 1] + inputArr[half]) / 2.0;
		}
	}
	
	private static double sortAndGetMedianOfArray(int[] inputArr) throws Exception {
		return medianOfSortedArray(sortIntArray(inputArr));
	}
	
	private static void printArrayOfInts(int[] inputArr) {
		int li = inputArr.length - 1;
		System.out.print("[");
		for (int i = 0; i < li; i++) {
			System.out.print(inputArr[i] + ", ");
		}
		System.out.println(inputArr[li] + "]");
		return;
	}
	
	public static void main(String[] args) {
		int[] testArr = {10, 2, 38, 22, 38, 23};
		printArrayOfInts(testArr);
		printArrayOfInts(sortIntArray(testArr));
		try {
			System.out.println("The median is: " + sortAndGetMedianOfArray(testArr));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return;
	}
}
