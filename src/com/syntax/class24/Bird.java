package com.syntax.class24;

public class Bird {
	
	public void fly() {
		System.out.println("Bird is flying");
	}
	
	public void eat() {
		System.out.println("Bird is eating");
	}
	
	public void sleep() {
		System.out.println("Bird is slepping");
	}

}

class BabyBird extends Bird{
	
	public void fly() {
		System.out.println("Baby bird can fly after few months");
	}
	
	public void eat() {
		System.out.println("Baby bird needs help to eat");
	}
	
	public void cry() {
		System.out.println("BabyBird is crying");
	}
	
	
}