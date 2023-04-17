package collectionpac;
import java.util.HashSet;
import java.util.Set;
public class HashSetDemo {
	public static void main(String[] args) {
		//creating hashset & adding element
		HashSet<String> set = new HashSet(); //creating hashset
		set.add("ram");//duplicate not allow
		set.add("rima");
		set.add("shyam");
		set.add("ram");
		set.add("ramesh");
		System.out.println("original list: "+set);
		//removing specific element from hash set
		set.remove("ram");
		System.out.println("after invoking remove: "+set );
		
		HashSet<String> set1 = new HashSet(); //set 2
		set1.add("pallabi");
		set1.add("rahul");
		System.out.println("new set: "+set1);
		set.addAll(set1);
		System.out.println("updated list: "+set);
		
		//remove all the new elements
		set.retainAll(set1);
		//remove all
		set.clear();
		System.out.println("present list: "+set);
		
	}

}
