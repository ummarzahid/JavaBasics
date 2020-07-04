package com.syntax.class06;

import java.util.Scanner;

public class SwitchHw {
	public static void main(String[] args) {
		// Allow user to enter grade and then provide explanation:
		// A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
		// At the end your program should print which grade was entered by a user with
		// explanation.
		Scanner scan = new Scanner(System.in);

//		System.out.println("Please enter your grade");
//		char grade = scan.next().charAt(0);
//		String result = "";
//
//		switch (Character.toUpperCase(grade)) {
//		case 'A':
//			result = "Excellent";
//			break;
//		case 'B':
//			result = "Good";
//			break;
//		case 'C':
//			result = "Average";
//			break;
//		case 'D':
//			result = "Bad";
//			break;
//		default:
//			result = "Not Acceptable";
//
//		}
//		System.out.println(grade + " was entered by user with explanation: " + result);
		System.out.println("----------------------");

		// HomeWork: Using scanner class create calculator.
		// Allow user to enter 2 numbers and operator(+,-,*,/).
		// Based on operator provide the result to user.

		System.out.println("Please enter first number");
		int num1 = scan.nextInt();

		System.out.println("Enter the operator");
		char operator = scan.next().charAt(0);

		System.out.println("Please enter second number");
		int num2 = scan.nextInt();
		double result;

		switch (operator) {
		case '+':
			result = num1 + num2;
			System.out.println(num1 + "+" + num2 + " = " + result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println(num1 + "-" + num2 + " = " + result);
			break;
		case '/':
			result = num1 / num2;
			System.out.println(num1 + "/" + num2 + " = " + result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println(num1 + "*" + num2 + " = " + result);
			break;
		default:
			System.out.println("Invalid");

		}

	}

}
