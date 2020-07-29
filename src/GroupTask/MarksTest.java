package GroupTask;

public class MarksTest {

	public static void main(String[] args) {

		Marks a = new A(85.5, 95.6, 75.6);
		System.out.println(a.getPercentage());

		Marks b = new B(85.5, 55.5, 75.6, 86.5);
		System.out.println(b.getPercentage());
	}

}
