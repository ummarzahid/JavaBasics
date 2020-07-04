package com.syntax.class16;

public class DifferentMethodsTest {
	public static void main(String[] args) {
		
		DifferentMethods obj = new DifferentMethods();
		obj.sayHello(2);
		// call method hello
		System.out.println("============");
		
		obj.sayHello(5);
		
		// call method printAnyword
		obj.printAnyword("I love you", 3);
		
		obj.printAnyword("Bye", 5);
				
		// call method hungry
		
		obj.isHungry(true);
		
		
	}

}
