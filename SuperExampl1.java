package superexamples;

class A{  //parent class
	String college;
	int id;
	String sub;
	A(String college,int id,String sub) {//parent constructor
		this.college=college;
		this.id=id;
		this.sub=sub;
	}
}
class B extends A{ //child class
	String name;//class B member
	
	B(String college,int id,String sub,String name){
		super(college,id,sub);//reuse class A
		this.name=name;
		}
		void print() {  //class B method
		System.out.println("name is :"+name);
		System.out.println(college+" "+id+" "+sub);
	    }
}
class C extends B{//child class
	
	C(String college,int id,String sub,String name){
		super(college,id,sub,name);//reuse class B
	    }
	
		void print() {//class C method
		System.out.println("name is :"+name);
		System.out.println(college+" "+id+" "+sub);
	    }
	
}

public class SuperExampl1 {
	public static void main(String[] args) {
		C obj = new C("anudip",1,"java","pinki");
		obj.print();
		B obj1=new B("anudip",2,"java","sapna");
		obj1.print();
		
		
	}

}
