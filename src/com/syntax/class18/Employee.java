package com.syntax.class18;

public class Employee {

	int eID;
	double salary;

	static String CEO = "Sumair's";

	void empData() {
		System.out.println(CEO + " emp id is " + eID + " and salary is " + salary);
	}

	public static void main(String[] args) {
		Employee emp = new Employee();

		emp.eID = 12345;
		emp.salary = 150000;
		emp.empData();

		Employee emp1 = new Employee();

		emp.eID = 911;
		emp.salary = 200000;
		emp.empData();

	}

}
