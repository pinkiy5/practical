package arrayexamples;
//example of single dimensional array
public class Arrayeg {
	public static void main(String[] args) {
		//declaring ,initializing and instantiation
		String [] name = {"mamta","ram","karan","ajay","ajit","tushar"};
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		System.out.println();
		int [] phone = {345,452,234,678,654,676,554,777,667,434,568};
		for(int j=0;j<phone.length;j++) {
			System.out.println(phone[j]);
		}
	}

}
