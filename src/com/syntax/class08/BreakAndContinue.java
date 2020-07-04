package com.syntax.class08;

public class BreakAndContinue {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			if (i == 4) {
				/////System.out.println("I'm stopping a loop");
				break;
			}
			System.out.println(i);

		}
		System.out.println("we are outside the loop");
		
		System.out.println("----Continue----");
		
		for (int i = 1; i <= 10; i++) {

			if (i == 4) {
				System.out.println("I'm skipping");
				continue;
			}
			System.out.println(i);

		}
		System.out.println("we are outside the loop");
	}

}
