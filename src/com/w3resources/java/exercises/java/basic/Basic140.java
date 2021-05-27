package com.w3resources.java.exercises.java.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Basic140 {
	/*
	 * Write a Java program to merge all overlapping Intervals 
	 * from a given a collection of intervals.
		Sample Output: 1 6
		8 10
		15 20
	 */
	
	private static ArrayList<Interval> mergeIntervals(ArrayList<Interval> inputArrayList) {
		ArrayList<Interval> workingArrayList = new ArrayList<>(inputArrayList);
		int n = workingArrayList.size();
		Interval interval1 = new Interval(), interval2 = new Interval();
		int start1 = 0, end1 = 0, start2 = 0, end2 = 0;
		if (n < 2)
			return workingArrayList;
		Collections.sort(workingArrayList, new IntervalComparator());
		int i = 1;
		while (i < workingArrayList.size()) {
			interval1 = workingArrayList.get(i - 1);
			start1 = interval1.getStart();
			end1 = interval2.getEnd(); 
			interval2 = workingArrayList.get(i);
			start2 = interval2.getStart();
			end2 = interval2.getEnd();
			if (interval1.getEnd() > interval2.getStart()) {
				workingArrayList.remove(i - 1);
				workingArrayList.remove(i - 1);
				workingArrayList.add(i - 1, new Interval(Math.min(start1, start2), Math.max(end1, end2)));
			} else {
				i++;
				if (i >= workingArrayList.size())
					break;
			}
		}
		return workingArrayList;
	}
	
	public static void main(String[] args) {
		ArrayList<Interval> test = new ArrayList<>();

        test.add(new Interval(1, 3));
        test.add(new Interval(2, 6));
        test.add(new Interval(8, 10));
        test.add(new Interval(15, 18));
        test.add(new Interval(17, 20));

        test = mergeIntervals(test);
        
        for (Interval r : test)
        	System.out.println(r.getStart() + " " + r.getEnd());
	}

}

class Interval {
	private int start;
	private int end;
	
	public Interval() {
		this.start = this.end = 0;
	}
	
	public Interval(int end) {
		this.start = 0;
		this.end = end;
	}
	
	public Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}	
}

class IntervalComparator implements Comparator<Interval> {
	@Override
	public int compare(Interval o1, Interval o2) {
		return o1.getStart() - o2.getStart();
	}
}

