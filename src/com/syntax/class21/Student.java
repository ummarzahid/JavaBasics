package com.syntax.class21;

//Write a Student class   that have instance variables name and address. 
//Create a constructor that will initialize those variables. 
//Print name & address of given  student using displayInfo method.

public class Student {
	
	String name, address;
	
	Student(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	void displayInfo() {
		System.out.println(name + address);
	}
	

	
	
	
	public static void main(String[] args) {
		
		
		Student obj = new Student("Ummar", " 1234 Alexandria Va, 22309");
		obj.displayInfo();
	}

}
