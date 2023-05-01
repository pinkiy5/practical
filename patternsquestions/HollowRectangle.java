package patternsquestions;

public class HollowRectangle {
	public static void main(String[] args) {
		//outer for loop
				for(int i =1;i<=4;i++) {
					//inner for loop
					for(int j=1;j<=5;j++) {
						if(i==1||j==1||i==4|j==5){
							System.out.print("*");
	
						}else {
						System.out.print(" ");
						}
					}
					System.out.println();
				}
			
	}

}
