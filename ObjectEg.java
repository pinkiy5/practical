package Class;
//3 ways to initialize object in java-by referance variable,by method,by constructor
public class ObjectEg {  //class 2
	int id;
	String name;
	}

class Object{ //main class
	public static void main(String[] args) {
		ObjectEg obj=new ObjectEg();  //create object--obj is ref variable
		obj.id=101;
		obj.name="pinki";
		System.out.println(obj.id+" "+obj.name);  //printing member with white space		
		
	}
}
