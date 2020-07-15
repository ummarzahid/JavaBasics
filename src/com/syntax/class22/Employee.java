package com.syntax.class22;

public class Employee {

	public static String companyName;
	protected String fullName;
	double salary;
	private long ssn;

	public void work() {
		System.out.println("Employee works");
	}

	public void getPaid() {
		System.out.println("Employee gets paid");
	}

}

class ScrumTeam extends Employee {

	String ceremonies;

	void attendMeetings() {
		System.out.println("Attends meetings");
	}

	void workBuildingSoft() {
		System.out.println("works on building software");
	}

}

class ProductOwner extends ScrumTeam {

	void communicate() {
		System.out.println("gets requirements form BA");
	}

	void PrioritizePb() {
		System.out.println("prioritizes product backlog");
	}

}

class ScrumMaster extends ScrumTeam {
	String quality;

	void ShieldTeam() {
		System.out.println("All team shielded");
	}

	void doMeetings() {
		System.out.println("All team do attending meeting");
	}

}

class Developer extends ScrumTeam {

	void code() {

	}

}

class Tester extends ScrumTeam {

	void test() {
		System.out.println("tests software for bugs");
	}

}

class BusinessAnalyst extends ScrumTeam {

	void gatherRequirements() {

	}

}
