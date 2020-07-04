package com.syntax.class02;

public class StringconcatenationDemo {
	
	public static void main(String[] args) {
		// I love Castro
		String name = "Castro";
		
		System.out.println("I love " + name);
		System.out.println("I love"+ " " + name);	
		
		String statement = "I love";
		
		// I don't want to cahnge my variable 
		System.out.println(statement + " " + name);
		System.out.println("______________");
		
		String car = "BMW";
		int year = 2020;
		// concatenation of two Strings
		 System.out.println(car + " of year " + year);
		 
		 // concatenation of a String with an integer  
		 System.out.println("BMW of year " + "2020");
		 
		 // Concatenation of a string with an variable of type integer
		 System.out.println("BMW of year " + year);
		 
		// Concatenation multiple things
		 System.out.println(car +" of year " + year);
		 
		 
		 
		
	}

}
