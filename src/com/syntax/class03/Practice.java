package com.syntax.class03;

public class Practice {
	public static void main(String[] args) {
		
		 int myNumber = 10; // as an original number
		    int stepOne = myNumber * myNumber; // result stepOne = 100
		    int stepTwo = stepOne + myNumber; // result stepTwo = 110 
		    int stepThree = stepTwo / myNumber; // result stepThree = 11
		    int stepFour = stepThree + 17; // result stepFour = 28
		    int stepFive = stepFour - myNumber; // result stepFive = 18
		    int stepSix = stepFive / 6; // result stepSix = 3
		    System.out.println("The magic number is " + stepSix + "!");
		    
		    // tried it with three different int 10, 20, 100 the magic number was same
		    System.out.println("--------------------------------------------------");
		    
		    int num1 = 5;
		    int num2 = 4;
		    int num3 = 3;
		    
		    int num4 = 7; 
		    int num5 = 10;
		    int num6 = 5;
		    
		    //start coding here
		    int result1 = (num1 + num2) - num3; // result1 = 6
		    
		    int result2 = (num4 * num5) / num6; // result2 =  14
		    
		    int mod = result2 % result1; 
		    System.out.println(result2 + " modded by " + result1 + " is " + mod);
		    System.out.println("--------------------------------------------------");
		    
		    double d = 500.4444;
		    long l = (long) d;
		    System.out.println(l);
		    System.out.println("--------------------------------------------------");
		    
		    double myDouble = 100.50;
		    int myInt = (int) myDouble;
		    System.out.println(myInt);
		    
		    
		    
		    
		    
		    
		
		
	}

}
