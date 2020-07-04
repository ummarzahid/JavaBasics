package com.syntax.class05;

import java.util.Scanner;

public class ClassTask {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// task 1
		// Prompt the user to enter person heights in inches.
		// Person should be classified as one of the following:
		// • short (under 60 inch)
		// • medium(between 60 -72 inch)
		// • tall (over 72 inch)

		System.out.println("Please enter your height in inches!");
		int H = scan.nextInt();

		if (H <= 60) {
			System.out.println("short height");
		} else if (H >= 60 && H <= 72) {
			System.out.println("medium height");
		} else if (H >= 72) {
			System.out.println("tall");
		}
		System.out.println("------------------------");
		// task 2
		// Write a program that will print whether it is a weekend or weekday.
		// If any day from 1-5 → output "It is a weekday",
		// anyday from 6-7 → output "It is a weekend",
		// any other day → output "Invalid day"

		System.out.println("Please enter day of the week 1-7");
		int day = scan.nextInt();

		if (day >= 1 && day <= 5) { //// other way (day == 1 || day == 5)
			System.out.println("It is a week day");
		} else if (day == 6 || day == 7) { //// other way (day >= 6 && day <= 7)
			System.out.println("It is a weekend");
		}
		System.out.println("---------------------");
		// task 3

		// Write a program that will read three inputs of scores (quiz, mid term, and
		// final scores)
		// and determine the grade based on the following rules:
		// if the average score >=90 → grade=A
		// if the average score >= 70 and <90 → grade=B
		// if the average score>=50 and <70 → grade=C
		// if the average score<50 → grade=F

		System.out.println("Please enter your Quiz score!");
		int quiz = scan.nextInt();

		System.out.println("Please enter your Mid-term score!");
		int midTerm = scan.nextInt();

		System.out.println("Please enter your Final score!");
		int fin = scan.nextInt();

		int ave = (quiz + midTerm + fin) / 3;

		if (ave >= 90) {
			System.out.println("Grade A");
		} else if (ave >= 80 && ave <= 90) {
			System.out.println("Grade B");
		} else if (ave >= 70 && ave <= 80) {
			System.out.println("Grade C");
		} else {
			System.out.println("Fail");
		}
		System.out.println("---------------------");
		// Task 4
		// Write a program for user to enter his/hers birth month. 
		// Based on the month define the season.
		// Example: if user is born in June, July or August → season ="Summer".
		// At the end of the program we should see output as "You were born ______".

		System.out.println("Please enter your Birth Month");
		String month = scan.nextLine();
		
		if (month.equals("September") || month.equals("October") || month.equals("November")) {
			System.out.println("You were born Autumn");
		}else {
			System.out.println("You were born in some other season");
		}
		
		
	}

}
