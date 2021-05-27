package com.w3resources.java.exercises.java.basic;

public class Basic133 {
	/*
	 * Write a Java program to find a path from top left to bottom in right 
	 * direction which minimizes the sum of all numbers along its path. 
		Note: Move either down or right at any point in time.
		Sample Output: Sum of all numbers along its path: 13
	 */
	public static int minRouteExplore(int[][] inputMat, int row, int col) {
		
		int sum = inputMat[row][col];
		
		int minRouteDown = (row < inputMat[0].length - 1) 
				? minRouteExplore(inputMat, row + 1, col) 
				: Integer.MAX_VALUE;
		
		int minRouteRight = (col < inputMat.length - 1) 
				? minRouteExplore(inputMat, row, col + 1) 
				: Integer.MAX_VALUE;
		
		return (minRouteDown == Integer.MAX_VALUE &&
					minRouteRight == Integer.MAX_VALUE &&
					row == inputMat[0].length - 1 &&
					col == inputMat.length - 1) 
						? sum 
						: sum + Math.min(minRouteDown, minRouteRight);
	}
	
	public static void main(String[] args) {
		int[][] test1 = {
				{7, 4, 2}, 
				{0, 5, 6}, 
				{3, 1, 2},
		};
		int[][] test2 = {
				{7, 4, 2}, 
				{8, 5, 6}, 
				{3, 1, 2},
		};
		System.out.println(minRouteExplore(test1, 0, 0));
		System.out.println(minRouteExplore(test2, 0, 0));
	}

}
