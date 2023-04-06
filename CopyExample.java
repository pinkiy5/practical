package io;
import java.io.*;
public class CopyExample {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("E:\\file.txt");  //read
			FileOutputStream fout = new FileOutputStream("E:\\assignment.txt"); ///write
			byte [] arr = new byte[1024];
			int i;
			while((i=fin.read(arr))>0) {
				fout.write(arr);
				
				
			}
			fin.close();
			fout.close();
			System.out.println("done");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
