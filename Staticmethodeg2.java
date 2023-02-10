package variablepac;

public class Staticmethodeg2 {
	int n = 30;
	static int m=10;
	static int add(int a, int b) {
		return a+b;}
		
		public static void main(String[] args) {
			int c=Staticmethodeg2.add(5,4);
			System.out.println(c);
			//we cannot call non static var in main without object because main method is static
			Staticmethodeg2 ref = new Staticmethodeg2();
			System.out.println(ref.n);
			System.out.println(m);


	}
	
	
	
	}
	
	
	


