package com.w3resources.java.exercises.java.basic;

public class Basic131 {
	/*
	 * Write a Java program to find the new length of a given sorted 
	 * array where each element appear only once (remove the duplicates).
		Original array: [1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7] 
		The length of the original array is: 11 
		After removing duplicates, the new length of the array is: 7
	 */
	private static int[] swapTwoElements(int[] inputArr, int index1, int index2) {
		int[] workingArr = inputArr.clone();
		int temp = workingArr[index2];
		workingArr[index2] = workingArr[index1];
		workingArr[index1] = temp;
		return workingArr;
	}
	
	private static int[] sortArray(int[] inputArr) {
		for (int i = 1; i < inputArr.length; i++) {
			if (inputArr[i] < inputArr[i - 1]) {
				return sortArray(swapTwoElements(inputArr, i, i - 1));
			}
		}
		return inputArr;
	}
	
	private static String arrayToString(int[] inputArr) {
		String outputString = "[";
		for (int i = 0; i < inputArr.length - 1; i++) {
			outputString += inputArr[i] + ", ";
		}
		outputString += inputArr[inputArr.length - 1] + "]";
		return outputString;
	}
	
	public static void main(String[] args) {
		int[] test = {6, 2, 1, 3, 7, 3, 4, 5, 1, 7, 3};
		System.out.println(arrayToString(test));
		System.out.println(arrayToString(sortArray(test)));
		return;
	}

}
