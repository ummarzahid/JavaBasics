package com.syntax.class15;

public class PreHW3 {
	public static void main(String[] args) {

		
		
		String day = "Sunday";
		String newString = "";

		for (int i = day.length() - 1; i >= 0; i--) {

			newString += day.charAt(i);
		}

		System.out.println(newString);

	}
}
