package com.syntax.class13;

public class Phone {
	String brand;
	String model;
	String os;
	String processor;
	int price;
	int year;

	public static void main(String[] args) {

		System.out.println("========IPhone========");

		Phone p1 = new Phone();
		p1.brand = "Apple";
		p1.model = "IPhone 11 Pro";
		p1.os = "ios 13.5";
		p1.processor = "A13 Bionic chip";
		p1.price = 1200;
		p1.year = 2020;

		System.out.println(p1.model + " " + p1.brand + " has " + p1.os + " and " + p1.processor + "."
				+ " It's price is $" + p1.price);

		p1.display();
		p1.storage();
		p1.connectivity();

		System.out.println("========Samsung========");

		Phone p2 = new Phone();
		p2.brand = "Samsung";
		p2.model = "Note 10";
		p2.os = "Android 9.0";
		p2.processor = "Snapdragon 855";
		p2.price = 1000;
		p2.year = 2019;

		System.out.println(p2.model + " " + p2.brand + " has " + p2.os + " and " + p2.processor + "."
				+ " It's price is $" + p2.price);

		p2.display();
		p2.storage();
		p2.connectivity();

		System.out.println("========Nokia========");

		Phone p3 = new Phone();
		p3.brand = "Nokia";
		p3.model = "Nokia 9 Pureview";
		p3.os = "Android 9.0";
		p3.processor = "Snapdragon 845";
		p3.price = 650;
		p3.year = 2019;

		System.out.println(p3.model + " " + p3.brand + " has " + p3.os + " and " + p3.processor + "."
				+ " It's price is $" + p3.price);

		p3.display();
		p3.storage();
		p3.connectivity();

	}

	void display() {
		System.out.println(brand + " has HD display");
	}

	void storage() {
		System.out.println(brand + " has up to 128 GB of storage");
	}

	void connectivity() {
		System.out.println(brand + " has both bluetooth and wireless connectivity");
	}

}
