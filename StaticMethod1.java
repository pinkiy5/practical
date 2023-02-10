package variablepac;

class StaticMethod {  //class 1
	//instance variable
	int rollno;
	String name;
	float fee;
	static String college= "MIT";  //static variable
	//static method to change value of static variable
	static void change() {  //static method
		college="ITC";
	}
	//constructor
	StaticMethod(int rollno,String name,float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	//user defined method
 void display() {
	 System.out.println(rollno+" "+name+" "+fee+" "+college);
 }
    public class StaticMethod1 {  //main class 
	   public static void main(String[] args) {
		   //calling static method with class name
		   StaticMethod.change();
		   //objects
		   StaticMethod s1=new StaticMethod(111,"pinki",5000);
		   StaticMethod s2=new StaticMethod(555,"sapna",6000);
		   s1.display();
		   s2.display();
		   
	   }
   }
}
