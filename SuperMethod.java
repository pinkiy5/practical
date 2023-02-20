package superexamples;
class Shape1 {//parent class
	void print() {//parent class method
	   System.out.println("print circle");	
	}
}
class Size1 extends Shape1{ //child class
	void print() { //same name method of parent class and child class method
		System.out.println("print triangle");} 
		void display() {
			System.out.println("print nothing");
		}
		void show() {//final method
			display();
			print();
			super.print(); //refer immediate parent method

		}
	}



public class SuperMethod {
public static void main(String[] args) {
	Size1 obj=new Size1();
	obj.show();
}
}
