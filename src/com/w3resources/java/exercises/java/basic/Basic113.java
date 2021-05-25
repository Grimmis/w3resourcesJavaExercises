package com.w3resources.java.exercises.java.basic;

public class Basic113 {

	public static int[] mergeSort(int[] arr1, int[] arr2) {
		int[] output = new int[arr1.length + arr2.length];
		int i1 = 0, i2 = 0;
		for (int i = 0; i < output.length; i++) {
			if (i1 == arr1.length && i2 < arr2.length) {
				output[i] = arr2[i2];
				i2++;
			} else if (i2 == arr2.length && i1 < arr1.length) {
				output[i] = arr1[i1];
				i1++;
			} else if (i1 == arr1.length && i2 == arr2.length) {
				break;
			} else if (arr1[i1] <= arr2[i2]) {
				output[i] = arr1[i1];
				i1++;
			} else {
				output[i] = arr2[i2];
				i2++;
			}
		}
		return output;
	}
	
	private static void printArr(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(arr[arr.length - 1] + "]");
	}
	
	public static void main(String[] args) {
			int[] test1 = {1, 2, 2, 5, 7, 11, 56};
			int[] test2 = {2, 2, 3, 7, 7, 32, 55, 55, 60};
			printArr(mergeSort(test1, test2));
		return;
	}

}
