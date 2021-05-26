package com.w3resources.java.exercises.java.basic;

public class Basic127 {
	/*
	 * Write a Java program to get the Postorder traversal 
	 * of its nodes' values of a given a binary tree.
	 */
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(50);
		tree.root.left = new Node(25);
		tree.root.right = new Node(75);
		tree.root.left.left = new Node(13);
		tree.root.left.right = new Node(37);
		tree.root.right.left = new Node(63);
		tree.root.right.right = new Node(87);
		// print_preorder() defined in BinaryTree
		tree.print_postorder();
		return;
	}

}
