package methodpac;

public class Parameterizedcons {
	int age;
	String name;
	//we have to pass parameter
	Parameterizedcons(int a,String n){
		age=a;
		name=n;
	}
	
void show() {
	System.out.println(age+ " "+name);
}
public static void main(String[] args) {
	Parameterizedcons d=new Parameterizedcons(50,"karan");
	Parameterizedcons d1=new Parameterizedcons(25,"rohit");
	Parameterizedcons d2=new Parameterizedcons(21,"roma");
	d.show();
	d1.show();
	d2.show();
}
}
