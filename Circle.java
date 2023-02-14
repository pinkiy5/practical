package inheritancepac;
class Aggregationeg{  //class 1
	int Square(int r) {  //method name square
		return r*r;
	}}
public class Circle {  //class 2
	Aggregationeg ag;  //object (entity ref)
	double pi = 3.14;
	double area(int radius) {   //p*r*r
		ag = new Aggregationeg();
		int psquare = ag.Square(radius);
		return pi*psquare;
	}
	public static void main(String[] args) {
		 Circle c = new Circle();
		double result = c.area(5);
		System.out.println(result);
	}
	

}
