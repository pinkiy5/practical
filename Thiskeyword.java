//without/with this keyword
package variablepac;

class Thiskeyword1 {  //class 1 outer class
	//instance variable
	int id;
	String name;
	double salary;
	//parameterized constructor
	Thiskeyword1(int id, String name,double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;}
	
	//method
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}
	public class Thiskeyword{  //main class
		public static void main(String[] args) {
			//objects
			Thiskeyword1 s1 = new Thiskeyword1(1,"pinki",5000);
			Thiskeyword1 s2 = new Thiskeyword1(2,"sapna",6000);
			s1.display();
			s2.display();
		}
	}
}
