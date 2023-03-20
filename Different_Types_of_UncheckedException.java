package Exceptionpack;

public class Different_Types_of_UncheckedException {
	public void display() { //method
		//before try - catch block
				String a="i am error";
				System.out.println(a);
				try {
					//arithmetic exception
					int i = 50/0; 
					System.out.println(i);
					//null pointer exception
					String s =null;
					System.out.println(s.length());
					//ArrayIndexOutOfBound exception
					int arr[]=new int[5];
					arr[7]=9;
					//number format exception
					String s1="riya";
					int n = Integer.parseInt(s1);
					System.out.println(n);
					
				}
				catch(Exception e) {
					System.out.println(e);
				}
		//after try-catch block
				String b = "The end";
				System.out.println(b);
				
			}
			public static void main(String[] args) {
				Different_Types_of_UncheckedException ep = new Different_Types_of_UncheckedException();
				ep.display();
			}
}
