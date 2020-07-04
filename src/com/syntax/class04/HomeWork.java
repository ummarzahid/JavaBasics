package com.syntax.class04;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the loan amount needed");
		// loan

		int loan = scan.nextInt();

		if (loan <= 200000) {
			System.out.println("Loan accepted");
		} else {
			System.out.println("loan rejected");
		}
		System.out.println("____________________________");

		// DMV

		System.out.println("Please enter your age!");
		int age = scan.nextInt();

		if (age >= 18) {
			System.out.println("You are eligible for Drivers License");
		} else {
			System.out.println("You are eligible for learners permit");
		}
		System.out.println("____________________________");

		// city, Temprature

		System.out.println("Please enter your city?");
		String city = scan.next();

		System.out.println("Enter Temprature in Fahrenhite:");
		int fTemp = scan.nextInt();
		int cTemp = (fTemp - 32) * 5 / 9;
		System.out.println("The temprature in " + city + " is " + cTemp);

		System.out.println("____________________________");

		// Credit card

		System.out.println("Do you have a credit card? (Yes or No)");
		String card = scan.nextLine();
		if (card.equalsIgnoreCase("Yes")) {
			System.out.println("What is the balance on your card?");
			int balance = scan.nextInt();
			if (balance > 1000) {
				System.out.println("Pay off immediatly!");
			} else {
				System.out.println("You can spend more.");
			}
		} else {
			System.out.println("Would you like to have one?");
		}
		System.out.println("------------------------------------------");

		// Numbers of worked years and annual salary

		System.out.println("Please enter how many years did you work:");
		int years = scan.nextInt();

		System.out.println("Please enter your salary:");
		double salary = scan.nextDouble();

		if (years >= 5) {
			System.out.println("You are eligible for the bonus");

			if (salary > 50000) {
				System.out.println("Your bonus is 5000");
			} else {
				System.out.println("Your bonus is 3000");
			}
		} else {
			System.out.println("You are not eligible for the bonus");
		}

	}

}
