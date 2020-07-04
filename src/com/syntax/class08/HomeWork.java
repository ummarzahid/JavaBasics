package com.syntax.class08;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		// Write a program that reads a range of integers (start and end point),
		// provided by a user
		// and then from that range prints the sum of the even and odd integers.

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a start number");
		int start = scan.nextInt();

		System.out.println("Please enter a end number");
		int end = scan.nextInt();

		int oddSum = 0;
		int evenSum = 0;

		for (int i = start; i <= end; i++) {

			if (i % 2 == 1) {
				oddSum += i;

			} else if (i % 2 == 0) {
				evenSum += i;
			}

		} // end of the for
		System.out.println("Sum of the even numbers is " + evenSum);

		System.out.println("Sum of the odd numbers is " + oddSum);

	}

}
