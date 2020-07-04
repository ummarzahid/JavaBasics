package com.syntax.class04;

public class NestedIfContinues {
	public static void main(String[] args) {
		// check if patient has allergies
		// if no allergies --> you are healthy
		//otherwise;
		// if peanut allergy; don't eat peanut 
		// Lactose allergy; Don't drink milk
		// bee allergy; don't mess with bees
		
		boolean allergies = true;	
		boolean peanut = true;
		boolean lactose = false;
		boolean bee = true;
		
		if (!allergies) {
			// No allergy
			System.out.println("You are healthy");
			 }else {
			//We have to check which allergy
			if (peanut) {
				System.out.println("Don't eat peanut");
			} if(lactose) {
				System.out.println("Don't drink milk");
			}if (bee) {
				System.out.println("Don't mess with bees");
			}
		}
		
		
	}

}
