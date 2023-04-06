package io;
import java.io.FileInputStream;
//we can read All character - using FileInputStream

public class AllCharFIS {
	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream("E:\\file.txt");  //source path
			//reading All character
			int i = 0;
			while((i=f.read()) != -1){
			System.out.print((char)i);  //convert it into character
		}
		f.close();
	}catch(Exception e) {
		System.out.println(e);
	}

}}
