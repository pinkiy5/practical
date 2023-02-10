package variablepac;

 class Staticvariable1 {  //class 1
	//instance variable
	int rollno;
	String name;
	float fee;
	static String college= "Hansraj";  //static variable
	//constructor
	Staticvariable1(int rollno,String name,float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	//user defined method
 void display() {
	 System.out.println(rollno+" "+name+" "+fee+" "+college);
 }
    public class Staticvariable {  //class 2
	   public static void main(String[] args) {
		   //objects
		   Staticvariable1 s1=new Staticvariable1(111,"pinki",5000);
		   Staticvariable1 s2=new Staticvariable1(555,"sapna",6000);
		   s1.display();
		   s2.display();
		   
	   }
   }
}
