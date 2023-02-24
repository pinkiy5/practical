package OverloadingandOverriding;
class Exam{ //parent class
	int marks() {  //marks is method of parent class
		return 0;
	}}
  class comp extends Exam{  //child class 1 comp
	  int marks() {//same name method as per parent
		  return 80;
	  }}
  class math extends Exam{  //child class 2 math
	  int marks() {//same name method as per parent
		  return 70;
	  }}
  class science extends Exam{  //child class 3 science
	  int marks() {//same name method as per parent
		  return 50;
	  }}
  class eng extends Exam{  //child class 4 eng
	  int marks() {//same name method as per parent
		  return 90;
	  }}
  

public class Overridingex {  //main class
	public static void main(String[] args) {
		//same name method calling by different child object
		comp c = new comp();
		math m = new math();
		science s =new science();
		eng e = new eng();
		System.out.println("computer marks is:"+c.marks());
		System.out.println("math marks is: "+m.marks());
		s.marks();
		e.marks();
		//another way to call child methods using parent class reference
		Exam exam; //parent class reference point
		exam=new science();
		System.out.println(exam.marks());
		exam=new eng();
		System.out.println(exam.marks());
	}

}
