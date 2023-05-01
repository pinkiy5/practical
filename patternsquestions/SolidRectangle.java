package patternsquestions;

public class SolidRectangle {
	public static void main(String[] args) {
		//outer for loop
		for(int i =1;i<=4;i++) {
			//inner for loop
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println("* ");
		}
	}

}
