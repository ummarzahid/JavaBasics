package com.syntax.class18;

public class Students {
//	Create a Class called Students
//	Create three  variables  studentName , studentID  and  numberOfStudents
//	Create three objects of the Students Class 
//	Set the value for  studentName , studentID and increment  the numberOfStudents for each object
//	Print out  total number of students

	String studentName;
	int studentID;
	static int numberOfStudents = 0;

	public static void main(String[] args) {

		Students s1 = new Students();

		s1.studentName = "Ummar";
		s1.studentID = 01;
		numberOfStudents++;

		Students s2 = new Students();

		s2.studentName = "Madeeha";
		s2.studentID = 02;
		numberOfStudents++;

		Students s3 = new Students();

		s3.studentName = "Mohammad";
		s3.studentID = 03;
		numberOfStudents++;
		
		System.out.println("Number of students are: " + numberOfStudents);

	}

}
