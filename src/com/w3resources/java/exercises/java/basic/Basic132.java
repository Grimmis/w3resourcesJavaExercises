package com.w3resources.java.exercises.java.basic;

import java.util.LinkedList;

public class Basic132 {
	/*
	 * Write a Java program to find the new length of a given sorted array 
	 * where duplicate elements appeared at most twice.
		Original array: [1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7]
		The length of the original array is: 13
		After removing duplicates, the new length of the array is: 10
	 */
	private static int getReducedLength(int[] inputArr) {
		int n = inputArr.length;
		if (n < 3)
			return n;
		
		LinkedList<Integer> workingList = new LinkedList<>();
		for (int x : inputArr) 
			workingList.add(x);
		
		int i = 2;
		while (i < workingList.size()) {
			if (workingList.get(i) == workingList.get(i - 1) &&
					workingList.get(i - 1) == workingList.get(i - 2))
				workingList.remove(i);
			else
				i++;
		}
		return workingList.size();
	}
	
	public static void main(String[] args) {
		int[] test = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7};
		System.out.println(test.length);
		System.out.println(getReducedLength(test));
	}

}
