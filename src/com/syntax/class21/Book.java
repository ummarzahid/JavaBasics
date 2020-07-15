package com.syntax.class21;

//Write program as a Book class   that will have instance variables and 2 Constructors. 
//While creating an object make sure:
//Instance variables are being initialized
//Both Constructors are being executed

public class Book {
	
	String type;
	int amount;
	
	Book() {
		this("thriller",1);
		System.out.println("Books are great way to kill time");
	}
	
	public Book(String type, int amount) {
		this.type = type;
		this.amount = amount;
		System.out.println("My favorigte books are " + type + " and I like to read and finish " + amount + " book a week");
	}
	
	public static void main(String[] args) {
		Book obj = new Book();
	}

}
