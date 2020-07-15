package com.syntax.class21;

//A inherited by B

public class B extends A {

	public static void main(String[] args) {
		A b = new A();
		b.printf();
		System.out.println("A inheirted by B and " + 
		"method called and reused from Class A");

	}

}
