package stringexamples;
//append() insert() replace() delete() reverse() -mutable class(string buffer and builder)
public class MutableExamplestring {
public static void my() {
	//String Buffer
	      StringBuffer s = new StringBuffer("Hello");  //object of StringBuffer class
	      s.append("World");
	      System.out.println("string is : "+s);  //hello world
	      s.insert(2, "riya");
	      System.out.println("insert is : "+s);
	      s.replace(1, 3, "java");
	      System.out.println("replace is: "+s);
	      System.out.println("capacity is : "+s.capacity());}
	/*//String Builder
	      StringBuilder s1=new StringBuilder();
	      s1.replace(1, 3, "java");
	      System.out.println("replace is: "+s1);
	      s1.delete(1, 3);
	      System.out.println("delete is: "+s1);
	      s1.reverse();
	      System.out.println("reverse is: "+s1);
          }*/
     public static void main(String[] args) {
	           my();
}
}
