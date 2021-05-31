package com.w3resources.java.exercises.java.basic;

public class Basic146 {
	/*
	 * Write a Java program to convert an sorted array to binary 
	 * search tree. Maintain minimal height of the tree.
		Sample Output:
		2
		1
		4
		6
		5
		3
	 */ // Poorly explained exercise...
	private static TreeNode intArrayToTree(int[] input, int start, int end) {
		TreeNode node = new TreeNode(0);
		if (start == end - 1) {
			node.val = input[start];
			node.right = new TreeNode(input[end]);
			return node;
		}
		if (start == end) {
			node.val = input[start];
			return node;
		}
		int mid = (start + end) / 2;
		node.val = input[mid];
		node.right = intArrayToTree(input, start, mid - 1);
		node.left = intArrayToTree(input, mid + 1, end);
		return node;
	}
	
	private static void travelTree(TreeNode input) {
		if (input != null) {
			travelTree(input.right);
			travelTree(input.left);
			System.out.println(input.val);
		}
	}
	
	private static void print146(int[] input) {
		TreeNode tree= intArrayToTree(input, 0, 5);
		travelTree(tree);
	}
	
	public static void main(String[] args) {
		int[] test = new int[] {1, 2, 3, 4, 5, 6};
		print146(test);
	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int val) {
		this.val = val;
		this.left = this.right = null;
	}
}