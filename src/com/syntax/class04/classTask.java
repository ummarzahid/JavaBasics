package com.syntax.class04;

public class classTask {
	public static void main(String[] args) {
		
		boolean Diploma = true;
		double gpa = 3.8;
		
		if(Diploma) {
			System.out.println("Congratulations!");
			if(gpa >= 3.5) {
				System.out.println("You are eligible for scholarship");
			}else {
				System.out.println("You should have studied harder");
			}
		}else {
			System.out.println("You should get a degree");
		}
		System.out.println("-------------------------------------");
		
		double mortgageRate = 2.5;
		double mortgagePrice = 250000;
		
		if (mortgageRate > 4.5) {
			System.out.println("I will not buy a house");
		}else {
			System.out.println("I will buy the house");
			if (mortgagePrice > 200000) {
				System.out.println("I need a loan");
			}else {
				System.out.println("I will use cash");
			}
		}
	}

}
