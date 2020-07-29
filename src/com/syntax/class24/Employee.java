package com.syntax.class24;

public class Employee {
	
	double salary;
	
	void getPaid() { // overriden method
		System.out.println("Employees get paid " + salary);
	}

}

class Contractor extends Employee {
	
	double hourlyRate;
	
	void getPaid() { // overriding method
		System.out.println("Contractor gets paid hourly rate = " + hourlyRate);
	}
	
}

class FullTimeEmployee extends Employee {
	
}

class PartTimeEmployee extends Employee {
	
}


