package interfaceexamples;

interface ParentInterface{
	void show(); //bydefault abstract method
	default void print() { //java 8 onwards
		System.out.println("default method");
	}
	static void display() {
		System.out.println("static method");
	}
}

 class InterfaceEg implements ParentInterface {  //class implements interface
	 @Override
	 public void show() {
		 System.out.println("parent interface method");
	 }
  public static void main(String[] args) {
	  InterfaceEg object = new InterfaceEg();
	  object.show();  //override abstract method
	  object.print(); //default method
	  ParentInterface.display();  //static method
}
}
