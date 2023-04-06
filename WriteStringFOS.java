package io;
import java.io.FileOutputStream;
//write String to byte array--write byte String file outputstream
public class WriteStringFOS {
	public static void main(String[] args) {
		try {
			//write byte to string
			FileOutputStream f = new FileOutputStream("E:\\Test.txt");
			//write byte to string
			f.write(82);  //byte value(ASCII Value)
			f.close();
			System.out.println("done");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
