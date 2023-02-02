package controlstatement;
import java.util.Scanner;

public class While_dowhile_test {
	public static void main(String[] args) {
		int sum = 0;
		int number = 0;
		
		//scanner class
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		
		while(true) {  //add only positive no condition
			number = sc.nextInt();
			if(number<0)break;
			
			sum+=number;  //sum= sum+number
		}
		
		System.out.println("sum is:"+sum);
		sc.close();
		
	}}*/

      Scanner input = new Scanner(System.in);
      do {
    	  sum+=number;
    	  System.out.println("enter the number");
    	  number = input.nextInt();
    	  
         }while (number >=0);
         System.out.println("sum is:"+sum);
         input.close();
         }}


		
		
		
		
		
		
