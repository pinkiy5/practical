package inheritancepac;
class SIparent3{ //parent class
	int salary = 30000; //parent class member
	void show() {
    System.out.println("salary is :" +salary);
	}}
//child class of SIparent3 & parent class of MultilevelExample2
class SIchild3 extends SIparent3{
	int bonus = 1500;  //child class variable
	void printbonus() {
		System.out.println("bonus is :"+bonus);
	}}

//child class of SIchild3
class SIchild4 extends SIchild3{
    int annualsal = salary + bonus;
    void print() {
	System.out.println("annual salary is :"+annualsal);
    }}
public class MultilevelExample2 {  //main class
	public static void main(String[] args) {
		SIchild4 object = new SIchild4();  //object of SIchild4
		object.show();
		object.printbonus();
		object.print();
	}}
	     

	
