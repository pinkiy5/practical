package collectionpac;
import java.util.Iterator;
import java.util.TreeSet;
//navigable set operation
public class TreeSetEg {
	public static void main(String[] args) {
		//creating and adding elements
		TreeSet<String> set = new TreeSet<String>();//creating set
		set.add("a");
		set.add("n");
		set.add("d");
		set.add("p");
		set.add("q");
		set.add("s");
		set.add("t");
		set.add("j");
		set.add("f");
		set.add("g");
		set.add("v");
		set.add("c");
		set.add("r");
		System.out.println("original set: "+set);
		//traversing elements through iterator in descending
		Iterator itr = set.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("lowest value: "+set.pollFirst());
		System.out.println("updated set after pollfirst: "+set);
		System.out.println("highest value: "+set.pollLast());
		System.out.println("updated set after polllast: "+set);
		
		System.out.println("reverse set: "+set.descendingSet());
		
		//sortedset set operation
		System.out.println("head set: "+set.headSet("q"));
		System.out.println("sub set: "+set.subSet("j", "r"));
		System.out.println("tail set: "+set.tailSet("s"));
		
	}

}
