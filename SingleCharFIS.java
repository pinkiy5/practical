package io;
import java.io.FileInputStream;
//we can read single character - using FileInputStream

public class SingleCharFIS {
	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream("E:\\file.txt");  //source path
			//reading single character
			int i = f.read();{
			System.out.print((char)i);  //convert it into character
		}
		f.close();
	}catch(Exception e) {
		System.out.println(e);
	}

}}
