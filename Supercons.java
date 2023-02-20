package superexamples;
class Shape2{ //parent class
	//constructor of parent class
	Shape2(){
		System.out.println("hello");}
	
}
class Size2 extends Shape2{//child class
	//constructor of child class
	Size2(){
		//super();
		System.out.println("hi");

	}
}

public class Supercons {
	public static void main(String[] args) {
		Size2 obj = new Size2();

	}

}
