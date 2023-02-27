package finalexamples;

public class Finalvariable1 {
	final int value;  //blank initialization of final variable
	Finalvariable1(){  //constructor can initialize value of blank final variable
		value = 70;
		System.out.println(value);
		
	}
	public static void main(String[] args) {
		Finalvariable1 fv = new Finalvariable1();  //creating object
	}

}
