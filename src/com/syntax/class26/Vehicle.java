package com.syntax.class26;

public abstract class Vehicle {

	String vin;
	public static int totalVehicles;

	public Vehicle(String vin) {
		this.vin = vin;
		totalVehicles++;
	}

	public static int getTotal() {
		return totalVehicles;
	}

	void drive() {
		System.out.println("All vehicle drives");
	}

	void stop() {
		System.out.println("All vehicle stop by pressing break");
	}

	abstract void start();

	abstract void openTrunk();

}

abstract class Car extends Vehicle {

	public Car(String vin) {
		super(vin);
		
	}

	void openTrunk() {
		System.out.println("All cars open trunk automatically");

	}
}

class Lamborgini extends Car {

	public Lamborgini(String vin) {
		super(vin);
		
	}

	void start() {
		System.out.println("Lamborgini starts magically");
	}

}


