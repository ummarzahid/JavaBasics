package com.syntax.class24;

public class StudentTest {
	
	public static void main(String[] args) {
		
		
		Student s = new SyntaxStudent();
		s.study();
		s.sports();
		
		Student s1 = new CollegeStudent();
		s1.study();
		
		Student s2 = new CollegeStudent();
		s2.sports();
		
		SchoolStudent s3 = new SchoolStudent();
		s3.fun();
		
	}

}
