package Overloading;

public class OverloadingChangingArgDatatype {
	
	static int sum(int a,int b) { //integer type
		return a+b;
	}
	
	static double sum(double x,double y) { //double type
		return x+y;
	}
	public static void main(String[] args) {
		System.out.println(OverloadingChangingArgDatatype.sum(5,6));
		System.out.println(OverloadingChangingArgDatatype.sum(9.7,7.4));
	}
}
