package Exceptionpack;
//constructor can throw an exception
public class Throws_With_Cons {
	String name;
	int age;
	public Throws_With_Cons(String name,int age) throws Exception {
		if(age<18) {
			throw new Exception("age should be more than 18");
		}
		this.name=name;
		this.age=age;
	}
	public static void main(String[] args) throws Exception{
		Throws_With_Cons obj= new Throws_With_Cons("pinki",25);
		System.out.println(obj.name +" "+ obj.age);
	}

}
