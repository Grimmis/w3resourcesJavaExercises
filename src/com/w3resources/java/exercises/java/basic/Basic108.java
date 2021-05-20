package com.w3resources.java.exercises.java.basic;

//import java.util.Scanner;

public class Basic108 {

	public static void main(String[] args) {
		/*Scanner intScanner = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		String intString;
		try {
			intString = intScanner.next();
			intScanner.close();
		} catch (Exception e) {
			intScanner.close();
			return;
		}
		*/
		String intString = "5";
		for (int i = 0; i < 8; i++) {
			intString = intString + "123456789";
		}
		int output = 0;
		for (Character c : intString.toCharArray()) {
			if (!Character.isDigit(c)) {
				System.out.println("Error: Please enter a postive integer...");
				return;
			}
			output += Integer.valueOf(c.toString()); 
		}
		System.out.println(output);
		return;
	}

}
