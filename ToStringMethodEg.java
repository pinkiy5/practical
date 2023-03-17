package stringexamples;
//represent any object to string
public class ToStringMethodEg {
	int rollno;
	String name , add;
	ToStringMethodEg(int rollno,String name,String add){
		this.rollno=rollno;
		this.name=name;
		this.add=add;
		
	}
	public String toString() {  //return object to string
		//return super.toString(); //object to string
		return rollno+" "+name+" "+add;
	}
public static void main(String[] args) {
	ToStringMethodEg s1=new ToStringMethodEg(1,"ram","mumbai"); //return the hashcode value of an object
	ToStringMethodEg s2=new ToStringMethodEg(2,"pinki","bhiwadi");
	System.out.println(s1);  //compiler write s1.toString()
	System.out.println(s2);
}
}
