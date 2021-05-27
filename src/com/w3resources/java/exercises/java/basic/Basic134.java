package com.w3resources.java.exercises.java.basic;

public class Basic134 {
	/*
	 * Write a Java program to find the distinct ways you can climb to 
	 * the top (n steps to reach to the top) of stairs. Each time you can 
	 * either climb 1 or 2 steps. Go to the editor
		Example: n = 5
		a) 1+1+1+1+1 = 5 b) 1+1+1+2 = 5 c) 1+2+2 = 5 d) 2+2+1 = 5 e) 2+1+1+1 = 5 f) 2+1+2 = 5 g) 1+2+1+1 = 5 h) 1+1+2+1 = 5
		Sample Output: Distinct ways can you climb to the top: 8
	 */
	private static int uniqueWaysToClimbStairs(int numberOfStairs, int start) {
		if (start == numberOfStairs)
			return 1;
		else if (start > numberOfStairs)
			return 0;
		int oneStepFromHere = uniqueWaysToClimbStairs(numberOfStairs, start + 1);
		int twoStepsFromHere = uniqueWaysToClimbStairs(numberOfStairs, start + 2);
		return oneStepFromHere + twoStepsFromHere;
	}
	
	private static int uniqueWaysToClimbStairs(int numberOfStairs) {
		return uniqueWaysToClimbStairs(numberOfStairs, 0);
	}
	
	private static void print134(int steps, int uniqueWays) {
		System.out.println("For " + steps + " stairs.");
		System.out.println("Distinct ways of climbing: " + uniqueWays);
	}
	
	public static void main(String[] args) {
		int test1 = 5;
		int test2 = 40;
		int uniqueWays1 = uniqueWaysToClimbStairs(test1);
		int uniqueWays2 = uniqueWaysToClimbStairs(test2);
		print134(test1, uniqueWays1);
		print134(test2, uniqueWays2);
	}

}
