package arrayexamples;
import java.util.Scanner;
//program to sum values of an array
public class SumofArray {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter the number of elements: ");  
		n=sc.nextInt();  
		int [] array = new int[n];  
		System.out.println("Enter the array values: ");  
		for(int i=0; i<n; i++)  
		{  
		//reading array elements from the user   
		array[i]=sc.nextInt();  
		}  
		System.out.println("Array elements  are: ");  
		// prints array elements using the for loop  
		for (int i=0; i<n; i++)   
		{  
		System.out.println(array[i]);  
		}
		//prints sum of array elements
		int sum = 0;
		for(int i =0;i<array.length;i++) {
			sum = sum + array[i];
		}
		System.out.println("Sum of array elements are : "+sum);

	}

}
