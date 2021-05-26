package com.w3resources.java.exercises.java.basic;

public class Basic124 {
	/*
	 * Write a Java program to find the index of a value in a sorted 
	 * array. If the value does not find return the index where it would 
	 * be if it were inserted in order.
		Example:
		[1, 2, 4, 5, 6] 5(target) -> 3(index)
		[1, 2, 4, 5, 6] 0(target) -> 0(index)
		[1, 2, 4, 5, 6] 7(target) -> 5(index)
	 */
	
	private static int findIndex(int[] inputArr, int target) {
		int lastIndex = inputArr.length - 1;
		if (target < inputArr[0]) {
			return 0;
		} else if (target > inputArr[lastIndex]) {
			return inputArr[lastIndex] - 1;
		} else {
			for (int i = 0; i < lastIndex + 1; i++) {
				if ((inputArr[i] == target) || (
						i > 0 && 
						i <= lastIndex && 
						inputArr[i - 1] < target && 
						inputArr[i] > target)
					) {
					return i - 1;
				}
			}
			return 0;
		}
	}
	
	private static void printFindIndex(int[] inputArr, int target) {
		int lastIndex = inputArr.length - 1;
		System.out.print("[");
		for (int i = 0; i < lastIndex; i++) {
			System.out.print(inputArr[i] + ", ");
		}
		System.out.println(inputArr[lastIndex] + "] " 
				+ target + "(target) -> " 
				+ findIndex(inputArr, target) + "(index)");
		return;
	}
	
	public static void main(String[] args) {
		int[] testArr = {1, 2, 3, 4, 5, 6};
		int target1 = 5, target2 = 0, target3 = 7;
		printFindIndex(testArr, target1);
		printFindIndex(testArr, target2);
		printFindIndex(testArr, target3);
		return;
	}

}
