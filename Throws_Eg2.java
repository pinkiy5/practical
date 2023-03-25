package Exceptionpack;
import java.io.IOException;
//checked exception
class Test {
	void display() throws IOException{
		System.out.println("throws exception perfectly");
	}

}
public class Throws_Eg2 {
	public static void main(String[] args) throws IOException {
		Test obj = new Test();
		obj.display();
		
	}
}

