package inheritancepac;
class Employee{ //parent class
	int salary = 11000;
	int bonus = 1500;
	void action() {
		int updatedsalary = salary + bonus;
		System.out.println(+updatedsalary+" updated salary");
	}}
class Engineer extends Employee { //child class
	int benefits = 10;
}
class Doctor extends Employee {  //child class
	int da = 5;
}

public class HierarchicalExample2 {
	public static void main(String[] args) {
		Engineer e = new Engineer();
		System.out.println(e.salary+e.benefits+" incremented salary for engineer");
	    e.action();
		Doctor d = new Doctor();
		System.out.println(d.salary+d.da+" incremented salary for doctor");
	    
	}
	

}
