package polymorphismexamples;

abstract class Testabstract{ //abstract class--parent class
	abstract void display();  //abstract method
	void show() {  //non abstract method
		System.out.println("non abstract method invoked");

	}}
class Demo1 extends Testabstract{  //1 child class
	void display() {
		System.out.println("demo1 method invoked");
	}}
 class Demo2 extends Testabstract{  //2 child class
	 void display() {
		 System.out.println("demo2 method invoked");
	 }}

public class Abstractmethod {
	public static void main(String[] args) {
		//Testabstract ab = new Testabstract();
		Demo1 obj = new Demo1();
		Demo2 obj1 = new Demo2();
		obj.display();
		obj1.display();
		obj.show();
	}

}
