package com.w3resources.java.exercises.java.basic;

import java.util.ArrayList;
import java.util.List;

public class Basic107 {
	
	private static List<Integer> risingThree(ArrayList<Integer> iArrList) {
		
		for (int i = 2; i < iArrList.size() - 1; i++) {
			if (iArrList.get(i - 2) < iArrList.get(i - 1) 
					&& iArrList.get(i - 1) < iArrList.get(i)) {
				return iArrList.subList(i - 2, i + 1);
			}
		}		
		return iArrList.subList(0, 2);
	}
	
	public static void main(String[] args) {
		
		Integer[] nums = {10, 2, 4, 3, 1, 4, 7, 6};
		ArrayList<Integer> myArrList= new ArrayList<>();
		for (Integer elem : nums) {
			myArrList.add(elem);
		}
		List<Integer> resultsArrayList = risingThree(myArrList);
		if (resultsArrayList.size() < 3) {
			System.out.println("There was no matching pattern.");
		} else {
			System.out.println(resultsArrayList.get(0) 
					+ ", " + resultsArrayList.get(1) 
					+ ", " + resultsArrayList.get(2));
		}
		return;
	}

}
