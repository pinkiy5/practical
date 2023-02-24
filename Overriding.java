//method overriding(1.same name method 2.same parameter 3.is-a relationship
package OverloadingandOverriding;

class TestOverriding{  //parent class
	void run() {
		System.out.println("running mode on");
	}
}

public class Overriding extends TestOverriding {  //child class
	void run() {  //override method
		System.out.println("running mood off");
	}
   public static void main(String[] args) {
	   Overriding a =new Overriding();
	   a.run();
}
}
