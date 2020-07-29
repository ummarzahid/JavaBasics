package com.syntax.class27;

public interface Trustable {

	void trust();
}

interface Bank extends Trustable {

	void deposit();

	void withdraw();

}

class PNC extends Mortgage implements Bank, Investments {

	public void deposit() {
		System.out.println("PNC bank takes deposits ");
	}

	public void withdraw() {
		System.out.println(" PNC gives you your money");
	}

	public void trust() {
		System.out.println("you can trust PNC bank with your money");

	}

	public void giveMortgage() {
		System.out.println("PNC gives mortgage");

	}

	public void doInvestments() {
		System.out.println("You can invest money with PNC");
	}

}

class BOA implements Bank {

	
	public void trust() {
		System.out.println("We can trust BOA with our money");
		
	}

	
	public void deposit() {
		System.out.println("You can deposit cash 24/7 in BOA");
		
	}

	
	public void withdraw() {
		System.out.println("We can witdraw money from BOA 24/7");
		
	}
	
}
