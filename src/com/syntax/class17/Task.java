package com.syntax.class17;

public class Task {
	public static void main(String[] args) {
		Task obj = new Task();

		System.out.println(obj.createEmail("john", "snow", "gmail"));

		boolean prime = obj.isPrime(2);
		System.out.println(prime);

		char grade = obj.getGrade(75);
		char grade1 = obj.grade(75);

		System.out.println("Value of grade=" + grade);
		System.out.println("Value of grade1=" + grade1);
	}
	
	/*
	 * Create a method createEmail(). Based on values of users name, lastName and email type, 
	 * your method should return complete email Address. 
	 * Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
	 */

	String createEmail(String firstName, String lastName, String emailType) {
		String mail = firstName + lastName + "@" + emailType + ".com";
		return mail;

	}

	/*
	 * Write a method to return whether given number is prime or not?
	 */
	boolean isPrime(int a) {
		boolean prime = true;

		if (a > 1) {
			for (int i = 2; i <= a / i; i++) {
				if (a % i == 0) {
					prime = false;
					break;
				}
			}
		} else {
			prime = false;
		}
		return prime;
	}

	/*
	 * Create class Student that will have a method getGrade. Your method should
	 * accept the score of a student and return a grade: score > 90 - A score >80 -
	 * B score >70 - C score > 50 - D anything else - F
	 */

	char grade(int a) {

		if (a > 50 && a <= 70) {
			return 'D';
		} else if (a > 70 && a <= 80) {
			return 'C';
		} else if (a > 80 && a <= 90) {
			return 'B';
		} else if (a > 90) {
			return 'A';
		} else {
			return 'F';
		}
	}

	char getGrade(int a) {

		char score;

		if (a > 90) {
			score = 'A';
		} else if (a <= 90 && a > 80) {
			score = 'B';
		} else if (a <= 80 && a > 70) {
			score = 'C';
		} else if (a <= 70 && a > 50) {
			score = 'D';
		} else {
			score = 'F';
		}
		return score;
	}

}
