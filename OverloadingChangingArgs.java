package Overloading;
//method overloading-same name method with different arguments in one class
//2 ways we overload method
//1. changing no of arguments
//2.changing data type of arguments
public class OverloadingChangingArgs {
	static int sum(int a,int b) { //two parameters
		return a+b;
	}
	
	static int sum(int x,int y,int z) { //three parameters
		return x+y+z;
	}

	public static void main(String[] args) {
		System.out.println(OverloadingChangingArgs.sum(5,6));
		System.out.println(OverloadingChangingArgs.sum(4,7,9));
	}
}
