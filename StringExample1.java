package stringexamples;
// char[] work same as java string
public class StringExample1 {
	public void show() { //method 1
		char[] arr= {'j','a','v','a'};  //char type array
		System.out.println(arr);
		String s=new String(arr);
		System.out.println("value is: "+s);  //"java"	
	}
    public void myFunction() {  //method2
    	String s1="pinki";
    	String s3="pinki"; //it does not create any object
    	String s2=new String(s1);
    	System.out.println(s2);  //pinki
    }
    public static void main(String[] args) {
    	StringExample1 str = new StringExample1();
    	str.show();
    	str.myFunction();
	}
}
