package arrayexamples;
import java.util.Scanner;
//program to find index of element of array
public class IndexofArray {
	public static void main(String[] args) {
		int n , index = 0 ;
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
		System.out.println("enter element to find index: ");
		//finding index of entered element
		int element = sc.nextInt();
		for(int i =0;i<n;i++) {
			if(array[i] == element) {
				index = i;
				break;
			}
		}
		System.out.println("Index of "+element+" is : "+index);
	}

}
