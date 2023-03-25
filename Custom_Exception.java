package Exceptionpack;

class InvalidAgeException extends Exception{
	public InvalidAgeException (String str) {  //constructor
		super(str); //call the constructor of parent exception
	}
}

public class Custom_Exception {
	static void checkage(int age) throws InvalidAgeException{
		if(age<25) {
			throw new InvalidAgeException("not eligible for java course");
		}
		else {
			System.out.println("java course registered successfully");
		}
	}
	/*public static void main(String[] args)throws InvalidAgeException {
		checkage(23);
	}}*/
	
	public static void main(String[] args) {
		try {
			checkage(23);
		}
		catch(InvalidAgeException e) {
			System.out.println(e);
		}
	}}
