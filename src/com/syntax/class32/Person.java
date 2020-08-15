package com.syntax.class32;

/*
 * Create a Person class with following private fields: name, lastName, age,
 * salary. Variables should be initialized through constructor. Inside the class
 * also create a method to print user details. In Test Class create a Map that
 * will store key in ascending order. In that map store personId and a Person
 * Object. Print each object details.
 */

public class Person {
	
	private String name;
	private String lastName;
	private int age;
	private int salary;
	
	public Person(String name, String lastName, int age, int salary) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}
	
	 void userDetails() {
		System.out.println(name + " " +lastName+ " age " + age + " salary " + salary);
	}

	

}
