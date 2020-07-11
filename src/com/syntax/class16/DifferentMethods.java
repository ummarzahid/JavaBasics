package com.syntax.class16;

public class DifferentMethods {
	
	//Let's create method that says hello any times 
	
	void sayHello (int times) {
		for (int i = 0; i < times; i++) {
			System.out.println("Hello");
		}
	}
	
	//create that I will print any word any number of times 
	
	void printAnyword(String word, int times) {
		
		for (int i = 0; i < times; i++) {
			System.out.println(word);	
		}
	}
	
	// create a method isHungry that will accept boolean 
	//value and prints, if passed value is true --> go cook
	//otherwise go to study.
	
	void isHungry(boolean areYouHungry) {
		
		if(areYouHungry) {
			System.out.println("Please cook for yourself");
		}else {
			System.out.println("Go ahead and study");
		}
		
	}
	
	
	
	
	
	

}
