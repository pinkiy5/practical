package collectionpac;
import java.util.*;

public class ArrayListUsingUserDefinedCL {
public static void main(String[] args) {
	Bank b = new Bank(12345,"mamta",5000.67,20);
	Bank b1 = new Bank(12335,"ram",7000.67,21);
	Bank b2 = new Bank(12245,"shyam",5400.67,30);
	Bank b3 = new Bank(12344,"karan",4000.67,22);
	Bank b4 = new Bank(12445,"priya",8000.67,55);
	Bank b5 = new Bank(12355,"pooja",9000.67,38);
	
	ArrayList<Bank> al = new ArrayList<Bank>();
	al.add(b);
	al.add(b1);
	al.add(b5);
	al.add(b3);
	al.add(b4);
	al.add(b2);
	
	Iterator itr = al.iterator();
	while(itr.hasNext()) {
		Bank obj = (Bank)itr.next();
		System.out.println(obj.accountNo+" "+obj.customerName+" "+obj.balance+" "+obj.customerAge);

	}


}
}
