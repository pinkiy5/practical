package polymorphismexamples;

public class Dynamicbinding {
	void show() { //dynamic binding
		System.out.println("it is clear");
	}}
class Binding extends Dynamicbinding{
	void show() {
		System.out.println("override");
	}
	public static void main(String[] args) {
		Dynamicbinding obj = new Dynamicbinding();
		obj.show();
	}
}

