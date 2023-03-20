package Exceptionpack;

public class ExceptionEg {
	public void display() { //method
//before try - catch block
		String a="i am error";
		System.out.println(a);
		try {
			int i = 50/0; //arithmetic exception
			System.out.println(i);
			//after exception cant execute the other lines
			String s ="riya";
			System.out.println(s.length());
		}
		catch(Exception e) {
			System.out.println(e);
		}
//after try-catch block
		String b = "i cannot be handle";
		System.out.println(a+" "+ b);
		
	}
	public static void main(String[] args) {
		ExceptionEg ep = new ExceptionEg();
		ep.display();
	}

}
