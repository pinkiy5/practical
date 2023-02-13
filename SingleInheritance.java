package inheritancepac;

class SIparent{ //parent class
	void show() { //parent class user defined method
		System.out.println("show the details");
}}
	
  class SIchild extends SIparent{  //child class
	  void display() { //child class user defined method
		  System.out.println("display the result");
	  }
  }

public class SingleInheritance {   // main class
	public static void main(String[] args) {
		SIchild child = new SIchild();  // create object of child class
		child.display();
		child.show();
	}
	
	}
	


