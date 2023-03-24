package Exceptionpack;
//whether a student is eligible for java course or not
public class Throw_Key {
	public static void check(int marks) {
		if(marks<60) {
			//throw instance = throw keyword new and then accept
			throw new ArithmeticException("student is not eligible");
		}
		else {
			System.out.println("student is eligible");
		}
	}

	public static void main(String[] args) {
          check(58);
	}

}
