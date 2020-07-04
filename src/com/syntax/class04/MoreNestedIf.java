package com.syntax.class04;

public class MoreNestedIf {
	public static void main(String[] args) {
		// Lets's have a date of month and the day of week  
		//if it is Friday -->  we are going to watch a movie 
		//                    if date is 13 --> watch a scary movie 
		//                    if date is not 13 --> 13 watch a comedy 
		//if it is not Friday --> we are going to JAVA
		
		boolean isFriday=false;
		int date=13;
		
		if(isFriday) {
			System.out.println("Today is friday, I am going to a movies");
			
				if(date==13) {
					System.out.println("I'll watch scary movie");
					
				}else {
					System.out.println("I'll watch a comedy");
				}
			
		}else {
			System.out.println("Today is not Friday, I am staying home");
		}
		
	}

}
