package GroupTask;
//Create a Class Car that would have the following fields: carPrice and color and method 

//calculateSalePrice() which should be returning a price of the car.
//Create 2 sub classes: Sedan and Truck. The Truck class has field as weight and has its own implementation of  
//calculateSalePrice() method in which returned price calculated as following: 
//if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
//The Sedan class has field as length and also does it is own implementation of calculateSalePrice(): 
//if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount

public class Car {

	double carPrice;
	String color;
	

	Car(double carPrice, String color) {
		this.carPrice = carPrice;
		this.color = color;

	}

	double calculateSalePrice() {
		double salesPrice = 0;
		return salesPrice;

	}

}

class Truck extends Car {

	int weight;
	double salesPrice;
	

	Truck(double carPrice, double salesPrice, String color, int weight) {

		super(carPrice, color);
		this.weight = weight;
		this.salesPrice = salesPrice;
	}

	double calculateSalePrice() {
		if (weight > 200) {
			salesPrice = carPrice * 0.9;
		} else {
			salesPrice = carPrice * 0.8;
		}
		return salesPrice;

	}

}

class Sedan extends Car {

	int length;
	double salesPrice;

	Sedan(double carPrice, double salesPrice, String color, int length) {

		super(carPrice, color);
		this.length = length;
		this.salesPrice = salesPrice;
	}

	double calculateSalePrice(){
		if (length>20) {
			salesPrice=carPrice*0.95;
		}else {
			salesPrice=carPrice*0.9;
		}
		return salesPrice;
	
	}
}
