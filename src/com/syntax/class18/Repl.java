package com.syntax.class18;

public class Repl {

	static String country;
	static String continent;

	void displayInfo() {
		System.out.println(country + " located on " + continent + " continent");
	}

	public static void main(String[] args) {

		Repl obj = new Repl();

		country = "Morocco";
		continent = "Africa";
		obj.displayInfo();

	}

}
