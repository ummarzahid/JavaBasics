package com.syntax.class24;

public class Degree {
	
	void getPrerequiste() {
		System.out.println("To get a degree you need high school diploma");
	}

}

class Master extends Degree{
	
	void getPrerequiste() {
		System.out.println("To get a Master degree you need bachelors degree");
	}
	
}

class Bachelors extends Degree{
	void getPrerequiste() {
		System.out.println("To get a bachelors degree you need associates degree");
	}
}
