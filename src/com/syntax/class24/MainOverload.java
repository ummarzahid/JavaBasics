package com.syntax.class24;

public class MainOverload {

	public static void main(String str) {
		System.out.println("I'm a main method with String");
	}

	public static void main(String str, int num) {
		System.out.println("I'm a method with 2 parameters");
	}

	public static void main(String[] args) {
		System.out.println("I'm a main method with String array"); // this overload method will execute first 
		main("main");
		main("main", 10);
	}
}
