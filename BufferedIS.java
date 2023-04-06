package io;
import java.io.*;
// read data from my source file by using BufferedInputStream 

public class BufferedIS {
	public static void main(String[] args) {
		try {
			//source file
			FileInputStream f = new FileInputStream("E:\\file.txt");
			BufferedInputStream b = new BufferedInputStream(f);
			int i ;
			while((i=b.read()) != -1) {
				System.out.print((char)i);
			}
			f.close();
			b.close();
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
