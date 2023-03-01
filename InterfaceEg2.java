package interfaceexamples;

interface Shape{
	void shape_name();
}
class Circle implements Shape{
	@Override
	public void shape_name() {
		System.out.println("draw a circle");
	}
}
class Triangle implements Shape{
	@Override
	public void shape_name() {
		System.out.println("draw a triangle");
	}
}

public class InterfaceEg2 {
	public static void main(String[] args) {
		Shape object = new Triangle();
		object.shape_name();
	}

}
