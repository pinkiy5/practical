package io;
import java.io.FileOutputStream;
//write String to byte array--write byte with file outputstream
public class WriteByteFOS {
	public static void main(String[] args) {
		try {
			//destination
			FileOutputStream f = new FileOutputStream("E:\\file.txt");
			String s = "welcome to anudip foundation";
			byte b[]=s.getBytes(); //converting string into byte array
			f.write(b);
			f.close();
			System.out.println("done");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
