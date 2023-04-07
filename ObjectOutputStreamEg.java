package io;
import java.io.*;
import java.io.Serializable;
/* Serialization : writing state of an object into byte stream & the reversebte into object
 this is known as Deserialization */

//object output stream -- serialization (object to byte stream)
class Student implements Serializable{ // serializable interface
	int id;
	String name;
	int fees;
	public Student(int id,String name,int fees) {  //parameterize constructor
		this.id=id;
		this.name=name;
		this.fees=fees;
		}}
public class ObjectOutputStreamEg {
	public static void main(String[] args) {
		try {
			Student s = new Student(101,"riya",2000); //s is a object of student class
			FileOutputStream fout = new FileOutputStream("E://Test.txt");  //write in file
			ObjectOutputStream obj = new ObjectOutputStream(fout);  //for serialization
			obj.writeObject(s);  //object into byte stream
			obj.close();
			System.out.println("done");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
