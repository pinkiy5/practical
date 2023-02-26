package OverloadingandOverriding;
//we cant override static method
class base{
	//non static method which will be overridden in derived class
	public int add(int a , int b) {
		System.out.println("in base class");
		return a+b;
	}
	//static method which will not be overridden in derived class
	public static void print() {
		System.out.println("in base class");
	}
}
class derived extends base{
	//this method overrides add() of base class because it is not a static method
	public int add(int a, int b) {
		System.out.println("in child class");
		return a+b;
	}
	// this method is hidden by print() in base
	public static void print() {
		System.out.println("in child class");
	}
}

public class StaticnotOverride {
	public static void main(String[] args) {
		base obj = new base();
		//here derive's add() is called according to overridding rule
		System.out.println(obj.add(4, 5));
		
		//this should invoke print method of class derive as per overriding rule
		//because a static method cant be overridden it uses base's print instead
		obj.print();
	}

}
