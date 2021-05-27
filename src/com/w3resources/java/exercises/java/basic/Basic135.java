package com.w3resources.java.exercises.java.basic;

import java.util.Arrays;
import java.util.LinkedList;

public class Basic135 {
	/*
	 * Write a Java program to remove duplicates from a 
	 * sorted linked list.
		Original List with duplicate elements:
		12->12->13->14->15->15->16->17->17
		After removing duplicates from the said list:
		12->13->14->15->16->17
	 */
	public static LinkedList<Integer> removeDuplicatesFromLinkedList(LinkedList<Integer> sortedLinkedList) {
		LinkedList<Integer> workingLinkedList = new LinkedList<>(sortedLinkedList);
		int n = workingLinkedList.size();
		int i = 1;
		while (i < n) {
			if (i >= workingLinkedList.size())
				break;
			else if (workingLinkedList.get(i - 1) == workingLinkedList.get(i))
				workingLinkedList.remove(i);
			else
				i++;
		}
		return workingLinkedList;
	}
	
	public static void main(String[] args) {
		Integer[] test = new Integer[] {12, 12, 13, 14, 15, 15, 16, 17, 17};
		LinkedList<Integer> testLinkedList = new LinkedList<Integer>(Arrays.asList(test));
		LinkedList<Integer> newLinkedList = removeDuplicatesFromLinkedList(testLinkedList);
		System.out.println(testLinkedList.toString());
		System.out.println(newLinkedList.toString());
	}

}
