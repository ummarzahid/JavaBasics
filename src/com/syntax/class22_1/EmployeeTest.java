package com.syntax.class22_1;

import com.syntax.class22.Employee;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		Employee.companyName = "Google";
		
		//new ScrumTeam(); not available because it is default
		
		WaterFallTeam wt = new WaterFallTeam();
		WaterFallTeam.companyName = "Amazon";
		
		
	}

}
