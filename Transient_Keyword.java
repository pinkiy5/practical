package io;
import java.io.*;
import java.io.Serializable;
//used with data members of class in order to avoid serialization

class Test implements Serializable{
	transient int id;
	String name;
	public Test(int i,String n) {
		this.id = i;
		this.name=n;
	}
}
public class Transient_Keyword {
	public static void main(String[] args) throws Exception{
		Test obj = new Test(1,"pinki");
		//serialization
		FileOutputStream f = new FileOutputStream("E://4119.txt");
		ObjectOutputStream o = new ObjectOutputStream(f);
		o.writeObject(obj);
		o.flush();
		o.close();
		f.close();
		System.out.println("done");
		
		//deserialization
		ObjectInputStream oi = new ObjectInputStream(new FileInputStream("E://4119.txt"));
		Test obj1 = (Test)oi.readObject();
		System.out.println(obj1.id+" "+obj.name);
		oi.close();
		
	}

}
