package GroupTask;

/*We have to calculate the average of marks obtained in three subjects by student A 
 *and by student B. Create class 'Marks' with an abstract method 'getPercentage' 
 *that will be returning the average percentage of marks. Provide implementation of 
 *abstract method in classes 'A' and 'B'. The constructor of student A takes the marks
 *in three subjects as its parameters and the marks in four subjects as its parameters
 *for student B. Test your code 
 */
public abstract class Marks {

	public abstract double getPercentage();

}

class A extends Marks {
	double science;
	double math;
	double history;
	
	  A(double science, double math, double history) {
			this.science=science;
			this.math=math;
			this.history=history;
		}
	 public double getPercentage() {
		 double average;
			return average = (science + math + history) / 3;
			
		}
	
}

class B extends Marks {
	
	double science;
	double math;
	double history;
	double socialStudies;
	
	  B(double science, double math, double history, double socialStudies) {
			this.science=science;
			this.math=math;
			this.history=history;
		}
	 public double getPercentage() {
		 double average;
			return average = (science + math + history + socialStudies) / 4;
			
		}
	
}
