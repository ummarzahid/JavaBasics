package com.syntax.class15;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		System.out.println("===How would you reverse a String character by character?===");

		String word = "Reverse the word character by character";

		for (int i = word.length() - 1; i >= 0; i--) {
			System.out.print(word.charAt(i));
		}

		System.out.println();
		System.out.println("\n====How would you reverse a String word by word?====");

		String word1 = "I'm taking software development bootcamp at Syntax";

		String[] word2 = word1.split(" ");

		for (int j = word2.length - 1; j >= 0; j--) {

			System.out.print(word2[j] + " ");

		}

		System.out.println();
		System.out.println("\n====How would you check if String is palindrome or not?====");

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word");

		String word3 = scan.next();

		String reverseWord = "";

		for (int a = word3.length() - 1; a >= 0; a--) {

			reverseWord = reverseWord + word3.charAt(a);

		}

		if (reverseWord.equalsIgnoreCase(word3)) {
			System.out.println(reverseWord + " is palindrome");
		} else {
			System.out.println(reverseWord + " is not palindrome");
		}

		System.out.println();
		System.out.println("\n====How would you swap 2 strings without a temporary variable?====");

		String x = "Happy";
		String y = "Birthday";

		x = x + y;
		y = x.substring(0, x.length() - y.length());
		x = x.substring(y.length());

		System.out.println("\nAfter swpping X is : " + x + " and Y is " + y);

	}

}
