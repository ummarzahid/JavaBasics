package com.syntax.class24;

public class Parent {
	
	private void hello() {// private method do not participate in inheritance => cannot override it 
		System.out.println("Hello from parent class");
	}

	protected static void hi() {
		System.out.println("Hi I'm from parent class ");
	}
	
}

class Child extends Parent{
	
	//creating own private method inside child class
	private void hello() {
		System.out.println("Hello from child class");
	}
	
	//@Override CE cannot override static method
	protected static void hi() {
		System.out.println("Hi I'm from child class");
	}
	
}