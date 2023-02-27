package finalexamples;
//final keyword -- used ad final variable , method , class
// final class - we can not extend it
// final method - we can not override it
//final variable -- cannot change value of final variable

public class Finalvariable {
	final int value = 5;  //final variable
	void display() {
		System.out.println(value);
		//we can not change value of final variable
		value = 7;  // compile time error
	}
public static void main(String[] args) {
	Finalvariable obj = new Finalvariable();
	obj.display();
}
}
