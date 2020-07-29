package com.syntax.class24;

public class Bank {

	double money, fee;

	Bank(double money) {
		this.money = money;
	}

	double chargeFee() {// overridden 
		if (money < 1000) {
			return  money * 0.1;
		} else {
			return  0;
		}
	}

}

class BOA extends Bank {

	public BOA(double money) {
		super(money);

	}

}

class PNC extends Bank{

	public PNC(double money) {
		super(money);
		
	}
	
	double chargeFee() { //overriding
		if (money < 1000) {
			return money * 0.2;
		} else {
			return 0;
		}
	}
	
}

class Citi extends Bank{

	public Citi(double money) {
		super(money);
		
	}
	
}
