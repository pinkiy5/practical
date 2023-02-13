package inheritancepac;

class SIparenteg{  //parent class
	int salary = 30000; //parent class member
	
}

public class SingleExample2 extends SIparenteg {
	int bonus = 1500;  //child class variable
	int annualsal = salary + bonus;      //used parent variable
	public static void main(String[] args) {
		SingleExample2 object = new SingleExample2();
		System.out.println("salary is :" +object.salary);
		System.out.println("annual salary is :"+object.annualsal);
	}

}
