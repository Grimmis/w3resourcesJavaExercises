package com.w3resources.java.exercises.java.basic;

public class Basic137 {
	/*
	 * Write a Java program to find possible unique paths considering some obstacles, 
	 * from top-left corner to bottom-right corner of a given grid (m x n).
		Note: You can move either down or right at any point in time and an obstacle 
		and empty space is marked as 1 and 0 respectively in the grid.
		Sample grid:
		int[][] obstacle_Grid ={
		{0, 0, 0},
		{0, 1, 0},
		{0, 0, 0},
		};
		Sample Output: Unique paths from top-left corner to bottom-right corner of the said grid (considering some obstacles): 2
	 */
	private static int findUniquePathsWithObstacles(int[][] grid, int x, int y) {
		int gridH = grid.length, gridW = grid[0].length;
		if (x == gridW - 1 && y == gridH - 1)
			return 1;
		if (grid[y][x] == 1)
			return 0;
		int goingDown = (y < gridH - 1) ? findUniquePathsWithObstacles(grid, x, y + 1) : 0;
		int goingRight = (x < gridW - 1) ? findUniquePathsWithObstacles(grid, x + 1, y) : 0;
		return goingDown + goingRight;
	}
	
	private static int findUniquePathsWithObstacles(int[][] grid) {
		return findUniquePathsWithObstacles(grid, 0, 0);
	}
	
	private static int[][] generateGrid(int x, int y) {
		int[][] grid = new int[y][x];
		for (int i = 0; i < y; i++) 
			for (int j = 0; j < x; j++) grid[i][j] = 0;
		return grid;
	}
	
	public static void main(String[] args) {
		int[][] obstacle_Grid = generateGrid(3, 3);
		obstacle_Grid[1][1] = 1;
		System.out.println(findUniquePathsWithObstacles(obstacle_Grid));
	}

}
