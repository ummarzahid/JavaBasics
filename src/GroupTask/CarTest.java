package GroupTask;

public class CarTest {

	public static void main(String[] args) {

		Car truck = new Truck(30000, 0, "Red", 100);

		double salesPriceForTruck = truck.calculateSalePrice();
		System.out.println("truck price after discount " + salesPriceForTruck + "truck color is " + truck.color);
				

		Car sedan = new Sedan(15000, 0, "Black", 30);

		double salesPriceForSedan = sedan.calculateSalePrice();
		System.out.println("sedan price after discount " + salesPriceForSedan + "sedan color is " + sedan.color);
				

	}

}
