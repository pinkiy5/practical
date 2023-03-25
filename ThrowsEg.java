package Exceptionpack;
//unchecked exception
public class ThrowsEg {
	//whether the student is pass or not
	public static void mydisplay(int a) throws ArithmeticException{
		if(a>=0 && a<35) {
			//throw new Arithmetic Exception
			throw new ArithmeticException("student is fail");
		}
		else {
			System.out.println("you are pass");
		}
	}
	//main method
	public static void main(String[] args) {
		//calling the function
		mydisplay(13);
		System.out.println("rest of the code");
	}

}
