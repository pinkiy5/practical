package methodpac;
//display default value
public class Method4 {
	int age;
	String name;
	void show(){ // method to display name and age
   System.out.println(age+ " "+name);}
	public static void main(String[] args) {
		//first object for name & age
		Method4 d=new Method4();
		// second object for name & age
		Method4 d1=new Method4();
		d.show();
		d1.show();
		
	}}
	
  
