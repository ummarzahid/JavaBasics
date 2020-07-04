package com.syntax.class12;

public class InterviewQuestions {
	public static void main(String[] args) {
//		Write a program to swap 2 numbers without a temporary variable?

//					int a=20;
//					int b=30;

//		Write a Java Program to print the first 10 numbers of Fibonacci series.

//	   Write a java program to find the second largest number in the array? Maximum and minimum number in the array?

		System.out.println("====Question 1=====");
		int a = 20;
		int b = 30;

		System.out.println("value of a = " + a + " value of b = " + b);

		a = a + b;

		b = a - b;

		a = a - b;

		System.out.println("value of a = " + a + " value of b = " + b);

		System.out.println("\n====Question 2=====");

		// Write a java program to check whether a given number is prime or not?

		int number = 35;
		boolean prime = true;

//		if (number > 1) { // I will check
//			// try to divide it by 2, 3, 4, 5, 6 ... 293-1
//			// if it is divisible by any of these numbers, it is not prime
//			for (int i = 2; i < number; i++) {
//				System.out.println("try to divide by " + i);
//				if (number % i == 0) { // number is divisible by i
//					prime = false;
//					break;
//				}
//			}
//
//		} else {
//			prime = false;
//		}

		// This was correct!
		// Can we improve it?
		// 1st improvement, try to divide it until number/2
		// 2nd improvement, try to divide it until number/i
		// (Gozde found it, she it hired)
		// if number is not divisible up to its square,
		// we don't need to continue checking

		if (number > 1) {
			for (int i = 2; i <= number / i; i++) {
				System.out.println("try to divide by " + i);
				if (number % i == 0) { // number is divisible by i
					prime = false;
					break;
				}
			}

		} else {
			prime = false;
		}

		System.out.println("The number " + number + " is prime: " + prime);

		System.out.println("\n====Question 3=====");

		int a1, b1, c;
		a1 = 1;
		b1 = 1;

		for (int i = 1; i <= 10; i++) {
			System.out.print(a1 + " ");
			c = a1 + b1;
			a1 = b1;
			b1 = c;
		}
		
		System.out.println("\n====Question 4=====");
		
		

	}

}
