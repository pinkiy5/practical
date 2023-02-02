package controlstatement;

public class SwitchExample2 {
	public static void main(String[] args) {
		char ch= 'p';
		switch(ch) {
		
		case 'a':
			System.out.println("first case executed");
			break;
		case 'b':
			System.out.println("second case executed");
			break;
		case 'p':
			System.out.println("third case executed");
			break;
		case 'k':
			System.out.println("fourth case executed");
			break;
			default :
				System.out.println("invalid case enter");		}
	}

}
