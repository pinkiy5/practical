package stringexamples;
import java.util.Scanner;
public class StringTest {
	String x="Hello";
	public void show() {  //method
		Scanner s=new Scanner(System.in);
		System.out.println("enter string: ");
		String a= s.next();  //first string
		String b= s.next();   //second string
		System.out.println(a.length()+b.length());
		System.out.println(a.compareTo(b)>0 ? "yes" : "no");
		System.out.println(a.substring(0, 4).toUpperCase()+a.substring(2)+" "+
		b.substring(0, 3).toLowerCase()+b.substring(1));
		System.out.println("substring is: "+x.substring(0, 3));
		System.out.println("substring is: "+x.substring(2));
		}
public static void main(String[] args) {
	StringTest t=new StringTest();
	t.show();
}
}
