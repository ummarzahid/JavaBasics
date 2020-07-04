package com.syntax.class06;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		// Ask user to enter their country and capture it.
		// Once values are captured print which language user speaks.

		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the country");

		String language = scan.next();

		switch (language.toLowerCase()) {
		case "usa":
			language = "English";
			break;
		case "australia":
		case "england":
			language = "British English";
			break;
		case "germany":
			language = "Dutch";
			break;
		default:
			language = "Unknown";
			break;
		}
		
		System.out.println("Your language is " + language);
	}

}
