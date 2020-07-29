package GroupTask;

public class ShapeTest {

	public static void main(String[] args) {

		Square s = new Square();
		s.a = 5;
		s.calculatePerimiter();
		s.calculateArea();
		System.out.println("==========");
		Circle c = new Circle();
		c.c=10;
		c.calculateArea();
		c.calculatePerimiter();
	}

}
