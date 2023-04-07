package io;
import java.io.*;
import java.io.Serializable;
import java.io.ObjectInputStream;

/* Serialization : writing state of an object into byte stream & the reversebte into object
 this is known as Deserialization */

//object input stream -- deserialization (object to byte stream)
class Student1 implements Serializable{ // serializable interface
	int id;
	String name;
	int fees;
	public Student1(int id,String name,int fees) {  //parameterize constructor
		this.id=id;
		this.name=name;
		this.fees=fees;
		}}
public class ObjectInputStreamEg {
	public static void main(String[] args) {
		try {
			ObjectInputStream oi = new ObjectInputStream(new FileInputStream("E://Test.txt"));  //for serialization
			Student s = (Student)oi.readObject();
			System.out.println("id is : " + s.id +" "+ "name is"
			+" "+ s.name+" "+" "+"fess is : "+ s.fees);
			oi.close();
			System.out.println("done");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
