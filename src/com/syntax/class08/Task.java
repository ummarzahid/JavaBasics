package com.syntax.class08;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {

		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("---------------------------");
		
		Scanner scan = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.println("Do you wan to apply for a credit card?");
			String reply = scan.next();
			if (reply.equals("yes")) {
				System.out.println("Congrats");
				break;
			}

		}

	}

}
