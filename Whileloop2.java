package controlstatement;

public class Whileloop2 {
	public static void main(String[] args) {
		int i = 0;
		//System.out.println("first 10 even no\n");
		do { //loop started
			System.out.println(i);  //atleast once
			i = i++;   //even no logic
			//exit control loop
		}while(i<=10);
	}

}
