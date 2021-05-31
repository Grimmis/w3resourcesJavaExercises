package com.w3resources.java.exercises.java.basic;

import java.util.Arrays;
import java.util.LinkedList;

public class Basic143 {
	/*
	 * Write a Java program to merge two given sorted lists.
		Sample Output:
		Merge Two Sorted ListsT:
		1 2 3 7 9 13 40 
	 */
	private static LinkedList<Integer>  mergeSort(LinkedList<Integer> input1, LinkedList<Integer> input2) {
		LinkedList<Integer> output = new LinkedList<>();
		while (input1.peekFirst() != null && input2.peekFirst() != null) {
			if (input1.peekFirst() <= input2.peekFirst()) output.add(input1.poll());
			else output.add(input2.poll());
		}
		if (input1.peekFirst() == null) for (Integer x : input2) output.add(x);
		else for (Integer x : input1) output.add(x);
		return output;
	}
	
	private static void print143(LinkedList<Integer> input1, LinkedList<Integer> input2) {
		System.out.println("1st Sorted List: " + input1.toString());
		System.out.println("2nd Sorted List: " + input2.toString());
		System.out.println(mergeSort(input1, input2).toString());
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> test1 = new LinkedList<>(Arrays.asList(new Integer[] {1, 3, 5, 6, 7, 8 }));
		LinkedList<Integer> test2 = new LinkedList<>(Arrays.asList(new Integer[] {4, 6, 7, 8, 9, 10}));
		print143(test1, test2);
	}

}
