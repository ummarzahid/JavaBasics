package GroupTask;

public interface Shape {

	void calculateArea();

	void calculatePerimiter();
}

class Square implements Shape {
	double a;
	double perimiter;
	double area;
	
	;

	public void calculateArea() {
		area = a*a;
		System.out.println("The are of Square is=" + area);
	}

	public void calculatePerimiter() {
	perimiter=4*a;
	System.out.println("The Perimiter of Square is="+perimiter);
	}
}
class Circle implements Shape {
	double c;
	double perimiter;
	double area;
	
	public void calculateArea () {
		area = 3.14 *c *c;
		System.out.println("The are of circle is" + area);
	}
	
	public void calculatePerimiter () {
		perimiter = 2*3.14 *c;
		System.out.println("The Perimiter of Circle is " + perimiter);
	}
	
	
}
