package com.w3resources.java.exercises.java.basic;

import java.util.LinkedList;

public class Basic121 {
	/*
	 * Write a Java program to reverse a given linked list. 
	 * Example: For linked list 20->40->60->80, the reversed 
	 * linked list is 80->60->40->20
	 */
	private static LinkedList<? extends Object> reverseLinkedList(LinkedList<? extends Object> linkedList) {
		LinkedList<Object> reversedLinkedList = new LinkedList<>();
		for (int i = linkedList.size() - 1; i >= 0; i--) {
			reversedLinkedList.add(linkedList.get(i));
		}
		return reversedLinkedList;
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> testLinkedList = new LinkedList<>();
		for (int i = 20; i < 100; i += 20) {
			testLinkedList.add(i);
		}
		System.out.println(testLinkedList);
		System.out.println("... and reversed...");
		System.out.println(reverseLinkedList(testLinkedList));
		
		return;
	}

}
