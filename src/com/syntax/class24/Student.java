package com.syntax.class24;

//Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent. 
//Define common behavior within parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Write example of achieving run time polymorphism

public class Student {

	public void study() {
		System.out.println("All student should study hard to achieve their goals ");
	}

	public void sports() {
		System.out.println("Student loves sports");
	}

}

class SyntaxStudent extends Student {

	public void study() {
		System.out.println("Syntax students are learning Java");
	}

}

class CollegeStudent extends Student {

	public void sports() {
		System.out.println("College students love basket ball");
	}

}

class SchoolStudent extends Student {

	public void fun() {
		System.out.println("School students do less fun than college students");
	}
}