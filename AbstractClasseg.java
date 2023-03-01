package polymorphismexamples;

abstract class Parentabs{
	Parentabs(){  //cons
		System.out.println("no-args cons");
	}
abstract void show(); //abstract method
void run() {
	System.out.println("non abstract method");
}}
class Childabs extends Parentabs{
	@Override
	void show() {
		System.out.println("method body");
	}
}

public class AbstractClasseg {
	public static void main(String[] args) {
		Parentabs object = new Childabs();
		object.show();
		object.run();
	}

}
