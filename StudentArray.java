package arrayexamples;
import java.util.Scanner;
//print 10 student name using array

public class StudentArray {
	public static void main(String[] args) {
		int n;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of students: ");  
		n=sc.nextInt();  
		//creates an array in the memory of length n  
		String [] array = new String[n];  
		System.out.println("Enter the student's name: ");  
		for(int i=0; i<n; i++)  
		{  
		//reading array elements from the user   
		array[i]=sc.nextLine();  
		}  
		System.out.println("Student's name are: ");  
		// accessing array elements using the for loop  
		for (int i=0; i<n; i++)   
		{  
		System.out.println(array[i]);  
		}  
		}  
	}


