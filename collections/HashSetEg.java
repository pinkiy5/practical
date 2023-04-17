package collectionpac;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class HashSetEg {
	//allowing null value
	public static void main(String[] args) {
		Set<String> s4 = new HashSet<String>(); //creating hashset
		s4.add("ac");//duplicate not allow
		s4.add("pencil");
		s4.add("mouse");
		s4.add("phone");
		s4.add(null); //allow null element
		s4.add("ac"); //not allow duplicate element
		s4.add("bottle");
		s4.add("earphone");
		s4.add("pen");
		Iterator<String> itr = s4.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
