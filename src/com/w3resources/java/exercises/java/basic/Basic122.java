package com.w3resources.java.exercises.java.basic;

import java.util.HashMap;

public class Basic122 {
	/*
	 * Write a Java program to find a contiguous subarray with largest sum 
	 * from a given array of integers. Note: In computer science, the maximum 
	 * subarray problem is the task of finding the contiguous subarray within 
	 * a one-dimensional array of numbers which has the largest sum. For 
	 * example, for the sequence of values −2, 1, −3, 4, −1, 2, 1, −5, 4; the 
	 * contiguous subarray with the largest sum is 4, −1, 2, 1, with sum 6. 
	 * The subarray should contain one integer at least.
	 */
	
	private static HashMap<String, Integer> findBigSubSum(int[] inputArr) {
		int bigSum = Integer.MIN_VALUE;
		int bigSumStart = 0;
		int bigSumEnd = 0;
		for (int i = 0; i < inputArr.length; i++) {
			if (inputArr[i] > bigSum) {
				bigSum = inputArr[i];
				bigSumStart = i;
				bigSumEnd = i;
			}
		}
		for (int i = 0, sum = 0; i < inputArr.length - 1; i++, sum = 0) {
			sum += inputArr[i];
			for (int j = i + 1; j < inputArr.length; j++) {
				sum += inputArr[j];
				if (sum > bigSum) {
					bigSum = sum;
					bigSumStart = i;
					bigSumEnd = j;
				}
			}
		}
		HashMap<String, Integer> outputHashMap = new HashMap<>();
		outputHashMap.put("sum", bigSum);
		outputHashMap.put("start", bigSumStart);
		outputHashMap.put("end", bigSumEnd);
		return outputHashMap;
	}
	
	public static void main(String[] args) {
		int[] testArr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println(findBigSubSum(testArr));
		return;
	}
}
