package com.w3resources.java.exercises.java.basic;

/**
 * @author grimm
 *
 */
public class BinaryTree {
	// Originally created for Basic125
	public Node root;

	public BinaryTree() {
		root = null;
	}
	
	public int get_depth(Node node) {
		if (node == null) {
			return 0;
		}
		int depthLeft = get_depth(node.left);
		int depthRight = get_depth(node.right);
		int deeper = Math.max(depthLeft, depthRight);
		return deeper + 1;
	}
	
	public int get_depth() {
		return get_depth(root);
	}
	
	public void print_preorder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.key + " ");
		print_preorder(node.left);
		print_preorder(node.right);
		return;
	}
	
	public void print_preorder() {
		print_preorder(root);
	}
	
	public void print_inorder(Node node) {
		if (node == null) {
			return;
		}
		print_inorder(node.left);
		System.out.print(node.key + " ");
		print_inorder(node.right);
		return;
	}
	
	public void print_inorder() {
		print_preorder(root);
	}
	
	public void print_postorder(Node node) {
		if (node == null) {
			return;
		}
		print_postorder(node.left);
		print_postorder(node.right);
		System.out.print(node.key + " ");
		return;
	}
	
	public void print_postorder() {
		print_postorder(root);
	}
}