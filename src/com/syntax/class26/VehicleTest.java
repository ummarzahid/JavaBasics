package com.syntax.class26;

public class VehicleTest {
	
	public static void main(String[] args) {
		Vehicle lambo = new Lamborgini("12ryeiuqd82476t");
		lambo.drive();
		lambo.start();
		lambo.stop();
		lambo.openTrunk();
		System.out.println(Vehicle.getTotal());
		
		Car car = new Lamborgini("276trehq2u7et428");
		car.drive();
		car.start();
		car.stop();
		car.openTrunk();
		System.out.println(Car.getTotal());
		
		
	}

}
