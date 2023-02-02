package controlstatement;

public class SwitchExample3 {
	public static void main(String[] args) {
		String name= "pinki";
		switch(name) {
		
		case "abh":
			System.out.println("first case executed");
			break;
		case "bhgf":
			System.out.println("second case executed");
			break;
		case "pinki":
			System.out.println("third case executed");
			break;
		case "pijhk":
			System.out.println("fourth case executed");
			break;
			default :
				System.out.println("invalid case enter");	
		}
	}

}
