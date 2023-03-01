package interfaceexamples;

interface ParentIterface{
	void show();  //by default abstract method
	}

 class InterfaceEg1 implements ParentIterface  {  //class implements interface
	 @Override
	 public void show() {
		 System.out.println("parent interface method");
	 }
  public static void main(String[] args) {
	  InterfaceEg1 object = new InterfaceEg1();
	  object.show();
}
}
