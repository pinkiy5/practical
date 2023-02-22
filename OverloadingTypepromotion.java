package Overloading;

public class OverloadingTypepromotion {
	void add(int a,double b) {
		System.out.println(a+b);
	}
    void add(int a,int b,int c) {
    	System.out.println(a+b+c);
    }
    
    public static void main(String[] args) {
    	OverloadingTypepromotion obj=new OverloadingTypepromotion();
    	obj.add(2, 3);  //3 will promoted to double
    	obj.add(10, 20,30);
	}
}
