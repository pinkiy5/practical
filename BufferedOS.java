package io;
import java.io.*;
// write information in the BufferedOutputStream Object which is connected to the FileOutputStream object

public class BufferedOS {
	public static void main(String[] args) {
		try {
			//we connected one stream(FileOutputStream) with another FileOutputStream
			FileOutputStream f = new FileOutputStream("E:\\file.txt");
			BufferedOutputStream b = new BufferedOutputStream(f);
			String s = "welcome to coding world";
			byte b1[]=s.getBytes(); //converting string into byte array
			f.write(b1);
			b.flush();//flushes data of one stream and send it into another stream
			f.close();
			b.close();
			System.out.println("done");
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
