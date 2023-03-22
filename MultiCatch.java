package Exceptionpack;
// only 1st exception will execute(multiple catch)
public class MultiCatch {
	static void myFunc() {
		try {
			int i = 50/0; //arithmetic
			System.out.println(i);
			int arr[]=new int[5];
			arr[7]=9; //arrayindexoutofbounds 
		}
		catch(ArithmeticException e) {
			System.out.println("first exception only");
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("array index out of bound expetion");
		}
		finally {//runs exception occur or not
			System.out.println("this is finally block");
		}

		
	}
	public static void main(String[] args) {
		myFunc();
	}

}
