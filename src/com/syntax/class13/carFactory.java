package com.syntax.class13;

public class carFactory {
	public static void main(String[] args) {

		// building an object of the car
		Car car1 = new Car();
		car1.make = "Tesla";
		car1.model = "X";
		car1.color = "Red";
		car1.year = 2020;
		car1.speed = 200;
		System.out.println("Make of 1 car is " + car1.make + " and model is " + car1.model + " and it is in "
				+ car1.color + " color");

		System.out.println("----Accessing methods from Car Class using car1----");

		car1.drive();
		car1.reverse();
		car1.transportPeople();

		// building an object of the car
		Car car2 = new Car();
		car2.make = "BMW";
		car2.model = "M5";
		car2.color = "Blue";
		car2.year = 2018;
		car2.speed = 240;
		System.out.println("Make of second car is " + car2.make);

		System.out.println("----Accessing methods from Car Class using car2----");

		car1.drive();
		car1.reverse();
		car1.transportPeople();

	
		Car car3 = new Car();
		car3.make = "Toyota";
		car3.model = "4Runner";
		car3.color = "White";
		car3.year = 2020;
		car3.speed = 260;
		System.out.println(car3.make);

		System.out.println("----Accessing methods from Car Class using car3----");

		car1.drive();
		car1.reverse();
		car1.transportPeople();

		Car car4 = new Car();
		car4.make = "Lexus";
		car4.model = "LX 570";
		car4.color = "Black";
		car4.year = 2020;
		car4.speed = 360;
		System.out.println(car4.make);

		System.out.println("----Accessing methods from Car Class using car4----");

		car1.drive();
		car1.reverse();
		car1.transportPeople();
		
		// new Bus(); compiler will give an error
		// because we never created Bus class

	

	}

}
