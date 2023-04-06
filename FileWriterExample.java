package io;
import java.io.FileReader;
import java.io.FileWriter;
public class FileWriterExample {
	public static void main(String[] args) {
		try {
			/*FileWriter fw = new FileWriter("E:\\Test.txt");
			fw.write("welcome to anudip foundation");*/
			FileReader fr = new FileReader("E:\\Test.txt");
			int i=0;
			while((i=fr.read()) != -1) {
				System.out.println((char)i);
			}
			//fw.close();
			fr.close();
			System.out.println("done");
			
		}catch(Exception e) {
		System.out.println(e);	
		}
		}

}
