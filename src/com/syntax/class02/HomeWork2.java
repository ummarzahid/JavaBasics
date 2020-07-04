package com.syntax.class02;

public class HomeWork2 {
	public static void main(String[] args) {
		// Write a Java program to add, subtract, multiply and divide 2 decimal values. 
		//Your program should say. "The _______ of 2 numbers ___ and ___ is equal to _____"
		double value1 = 10.5;
		double value2 = 20.5;
		
		double sum = value1 + value2;
		System.out.println("The sum of 2 numbers " + value1 + " " + "and " + value2 + " " + "is equal to " + sum + '.');
		double sub = value1 - value2;
		System.out.println("The sub of 2 numbers " + value1 + " " + "and " + value2 + " " + "is equal to " + sub + '.');
		double mult = value1 * value2;
		System.out.println("The mult of 2 number " + value1 + " " + "and " + value2 + " " + "is equal to " + mult + '.');
		double div = value1 / value2;
		System.out.println("The div of 2 numbers " + value1 + " " + "and " + value2 + " " + "is equal to " + div + '.');
		System.out.println("******************************");
		// write a program to find the square of the number 3.9.
		// You program should say "The square of the ____ is ____ "
		double num = 3.9;
		double square = 3.9 * 3.9;
		System.out.println("The suqare of the " + " " + num + " " + "is " + square + '.');
		System.out.println("*******************************");
		// Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8.
		// Your program should say. "The perimeter of a rectangle with width ___ and height ____ is equal to _____ and the area is __"
		
		int w = 5, h = 8;
		System.out.println("The perimeter of a rectangle with width " + w + " " + "and height" + h + " " + "is equal to " + (w+h)*2 + " " + "and area is " + w*h + '.' );
		
		
		
		
	}

}
