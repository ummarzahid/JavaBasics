package com.syntax.class21;

//Write a Java program called Teacher.  Identify features and behaviour of that Class. 
//Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features and behaviour. 
//Test all 4 classes

public  class Teacher {
	
	String name, lastName, subject;
	int yearsOfExp;
	
	public void info() {
		System.out.println(name + " " + lastName + " has " + yearsOfExp + 
				" years of experience and specializes in " + subject);
	}

}
