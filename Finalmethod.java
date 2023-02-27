package finalexamples;
//final method - we can not override it
 class Finalmethod1{  //parent class
	 final void display() {  //final method
		 System.out.println("this is final method");
	 }
	 
 }
 
 class child extends Finalmethod1{
	 //try to override final method
	 final void display() {  //final method
		 System.out.println("this final method is overridden");
	 }
 }
public class Finalmethod {
	public static void main(String[] args) {
		child obj = new child();
		obj.display();
	}

}
