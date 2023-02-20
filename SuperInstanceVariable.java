package superexamples;

class Shape {//parent class
	String name= "circle";
}

class Size extends Shape{ //child class
	String name="no size";
	void print() {
		System.out.println(name); // it represent child class instance var
		System.out.println(super.name); //it represent parent class instance var
	}
}
public class SuperInstanceVariable {
	public static void main(String[] args) {
		Size obj = new Size();
		obj.print();
	}

}
