package patternsquestions;

public class InvertedHalfPyramidRotated180 {
	public static void main(String[] args) {
		int n=4;
		for(int i =1;i<=n;i++) {  //loop for rows no
			for(int j=1;j<=n-i;j++) { //loop for print space
				System.out.print(" ");
			  }
				for(int j=1;j<=i;j++) {  //loop for print *
					System.out.print("*");
				}
			
			System.out.println();
		}
	}

}
