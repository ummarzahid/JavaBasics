package com.syntax.class11;

public class ReplPractice {
	public static void main(String[] args) {

//		for (int a = 1; a <= 5; a++) {
//			for (int b = 1; b <= 10; b++) {
//				System.out.print(a * b + " ");
//			}
//			System.out.println();
//		}
//		System.out.println("==================================");
//
//		for (int i = 1; i <= 4; i++) {
//			for (int j = 1; j <= 4; j++) {
//
//				if (i == 1 || i == 4 || j == 1 || j == 4) {
//					System.out.print("$");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//
//		System.out.println("==================================");
//
//		for (int s = 7; s >= 1; s--) {
//			for (int t = 1; t <= s; t++) {
//				System.out.print(t + " ");
//			}
//			System.out.println();
//		}
//		for (int r = 2; r <= 7; r++) {
//			for (int c = 1; c <= r; c++) {
//				System.out.print(c + " ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println("==================================");

//		int[] num = {45, 78, 12, 67, 55};
//		
//		for (int r = 0; r < num.length; r++) {
//			System.out.print(num[r] + " ");
//		}
//		System.out.println();

//		System.out.println("==================================");

		// Write a program that creates an array of integers that stores the following
		// values:
		// 45,78, 12, 67, 55, 89, 23, 77, 88
		// Print only values that stored with even index including 0

//		int[] arr = {45,78, 12,  67, 55, 89, 23, 77, 88};
//
//		for (int i = 0; i < arr.length; i+=2) {
//
//			System.out.print(arr[i] + " ");
//			
//		}

//		System.out.println("==================================");

//		Write a program that creates an array with the following values
//		{s, a, y,  b, n, c, t,  d, a, e, x} 
//		Print the values so the output should look like below

//		char[] name= {'s', 'a', 'y',  'b', 'n', 'c', 't',  'd', 'a', 'e', 'x'};
//		
//		for (int i = 0; i < name.length; i+=2) {
//			System.out.print(name[i]);
//		}

//		System.out.println("==================================");

		// Write a program that creates an array of strings with the following values
		// {"This", "is", "array", "of", "strings"} and prints all values in one line.

//		String[] text = {"This", "is", "array", "of", "strings"};
//		
//		for (String array: text) {
//			System.out.print(array + " ");
//		}

//		System.out.println("==================================");

		// Write a program that creates an array of integers of size 11.
		// Add the years 2010 to 2020 to your array one by one
		// using a for loop and then print all those values.

		int[] years = new int[11];

		for (int i = 0; i <= years.length - 1; i++) {

			years[i] = 2010 + i;
		}

		for (int i = 0; i < years.length; i++) {

			System.out.println(years[i]);
		}
		

	}

}
