package com.syntax.class04;

import java.util.Scanner;

public class ScannerIfElse {
	public static void main(String[] args) {
		// Windows ctrl+shift+o
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first Number!");
		int num1 = scan.nextInt();
		System.out.println("Enter second number");
		int num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1 + " is larger than " + num2);
		}else if (num1 < num2) {
			System.out.println(num1 + " is smaller than " + num2);
		}else {
			System.out.println(num1 + " is equal to " + num2);
		}
		
	}

}
