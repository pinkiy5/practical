package collectionpac;
import java.util.Set;
import java.util.Iterator;
import java.util.LinkedHashSet;
// lhs inherits the hashset class & implements the set interface
public class LinkedHashSetExample {
//allowing null method
	public static void main(String[] args) {
		Set<String> s = new LinkedHashSet<String>();
		s.add("pen");
		s.add("pencil");
		s.add("mouse");
		s.add("phone");
		s.add(null);
		s.add("ac");
		s.add("bottle");
		s.add("earphone");
		s.add("pen");//not allowing duplicates
		Iterator<String> itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
