package methodpac;
import java.util.*;
public class Method1 {
	public static void main(String[] args) {
		// create scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		//read number from user
		int num=sc.nextInt();
		//call method
		findevenodd(num);
		
	}
	//create method calling in main method so it is static
	public static void findevenodd(int num) {
		if(num%2==0) {
			System.out.println(num+" "+ "is even");
		}
		else {
			System.out.println(num+" "+ "is odd");
		}
	}

}
