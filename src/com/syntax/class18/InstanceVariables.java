package com.syntax.class18;

public class InstanceVariables {
	
	String name = "Yuriy"; // instance variable inside a class but outside a method
	
	public static void main(String[] args) {
		
		String name = "Kristina"; //local variable
		System.out.println(name); //Kristina
		
		//we created an object or we instanciatea class --> InstanceVariables
		InstanceVariables obj = new InstanceVariables();
		System.out.println(obj.name); //Jane
		
		//would like to change value from Kristina to Castro --> changing value of local the variable
		name = "Castro";
		System.out.println("New value of local variable " + name); // Castro
		
		//would like to change Jane to Ed --> changing value of the instance variable 
		obj.name = "Ed";
		System.out.println("New value of instance variable " + obj.name);
		
		System.out.println("Printing value of name using 2 instance");
		InstanceVariables obj1 = new InstanceVariables();
		System.out.println(obj1.name);
		
	}

}
