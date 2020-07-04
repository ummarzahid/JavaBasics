package com.syntax.class10;

public class Task {
	public static void main(String[] args) {
		// Create an array of chars and store grades into it: A,B,C,D,E,F.
		// Then print a grade B (use 2 different ways of creating an array).

		char[] grades = { 'A', 'B', 'C', 'D', 'E', 'F' };
		System.out.println(grades[1]);

		System.out.println("---2nd way---");
		char[] Grades = new char[6];
		Grades[0] = 'A';
		Grades[1] = 'B';
		Grades[2] = 'C';
		Grades[3] = 'D';
		Grades[4] = 'E';
		Grades[5] = 'F';

		System.out.println(Grades[1]);

		System.out.println("================================================");

		// Create an array of names and store all names of your group.
		// Then print your name from that array. (use 2 different ways of creating an
		// array).

		String[] names = { "Ummar", "Madeeha", "Muhammad", "Neil" };
		System.out.println(names[0]);

		System.out.println("---2nd way---");

		String[] Names = new String[5];
		Names[0] = "Ummar";
		Names[1] = "Madeeha";
		Names[2] = "Muhammad";
		Names[3] = "Neil";
		System.out.println(names[0]);

		System.out.println("================================================");

		// Create an array of words: Java, Saturday, day, coding, is.
		// Print the following sentence using elements of array: “Saturday is Java
		// coding Day”.

		String[] words = { "Java", "Saturday", "day", "coding", "is" };
		String total = (String) (words[1] + " " + words[4] + " " + words[0] + " " + words[3] + " " + words[2]);
		System.out.println(total);

	}

}
