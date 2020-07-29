package com.syntax.class25;

public class Computer {

	int price;
	String name;

	public Computer(int price, String name) {
		this.name = name;
		this.price = price;

	}

	public void display() {
		System.out.println(name + " price is " + price);
	}

}

class Apple extends Computer {

	public Apple(int price, String name) {
		super(price, name);
		
	}
	
	public void display() {
		System.out.println(name + " price is " + price);
	}

}

class Lenovo extends Computer {

	public Lenovo(int price, String name) {
		super(price, name);
		
	}
	
	public void display() {
		System.out.println(name + " price is " + price);
	}

}

class HP extends Computer {

	public HP(int price, String name) {
		super(price, name);
		
	}
	
	public void display() {
		System.out.println(name + " price is " + price);
	}

}

class Dell extends Computer {

	public Dell(int price, String name) {
		super(price, name);
		
	}
	public void display() {
		System.out.println(name + " price is " + price);
	}

}