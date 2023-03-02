package polymorphismexamples;
//understanding type --1. variable type -- int a=50
//2. reference type--
//class blank
//psvm(String []args)
//bank obj;
//object type -- bank obj = new bank();

public class Staticbinding {
	private void display() { //static(private,final,static)
		System.out.println("something");
	}
  public static void main(String[] args) {
	  Staticbinding obj = new Staticbinding();
	  obj.display();
}}


