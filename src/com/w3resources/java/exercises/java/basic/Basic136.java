package com.w3resources.java.exercises.java.basic;

public class Basic136 {
	/*
	 * Write a Java program to find possible unique paths from top-left corner to 
	 * bottom-right corner of a given grid (m x n).
		Note: You can move either down or right at any point in time.
		Sample Output: Unique paths from top-left corner to bottom-right corner of the said grid: 3
	 */
	private static int findUniquePaths(int[][] grid, int[] startingCoordinates) {
		int gridH = grid.length;
		int gridW = grid[0].length;
		if (startingCoordinates[0] == gridW - 1 &&
				startingCoordinates[1] == gridH - 1)
			return 1;
		int goingDown = 0, goingRight = 0;
		if (startingCoordinates[0] < gridW - 1)
			goingDown = findUniquePaths(grid, new int[] {startingCoordinates[0] + 1, startingCoordinates[1]});
		if (startingCoordinates[1] < gridH - 1)
			goingRight = findUniquePaths(grid, new int[] {startingCoordinates[0], startingCoordinates[1] + 1});
		return goingDown + goingRight;
	}
	
	private static int findUniquePaths(int[][] grid) {
		return findUniquePaths(grid, new int[] {0, 0});
	}
	
	private static int[][] generateGrid(int dimeX, int dimeY) {
		int[][] outputGrid = new int[dimeY][dimeX];
		for (int i = 0; i < dimeY; i++) {
			for (int j = 0; j < dimeX; j++)
				outputGrid[i][j] = 0;
		}
		return outputGrid;
	}
	
	@SuppressWarnings("unused")
	private static int[][] generateGrid(int dime) {
		return generateGrid(dime, dime);
	}
	
	private static void print136(int dimeX, int dimeY) {
		int[][] grid = generateGrid(dimeX, dimeY);
		int paths = findUniquePaths(grid);
		System.out.println("In a(n) " + dimeX + " x " + dimeY + " grid:");
		System.out.println("There are " + paths + " unique paths.");
	}
	
	private static void print136(int dime) {
		print136(dime, dime);
	}
	
	public static void main(String[] args) {
		print136(3);
		print136(6);
		print136(8, 3);
		print136(7, 64);
	}

}
