package collectionpac;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArratlistUsingIteratorEg {
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("rose");
		al.add("sunflower");
		al.add("lily");
		al.add("daisy");
		al.add("marigold");
		al.add("tulip");
		al.add("jasmin");
		al.add("orchid");
		al.add("lotus");
		al.add("lavender");
		
		System.out.println("traversing using for loop");
		for(int i =0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("traversing using for each loop");
		for(String a:al) {
			System.out.println(a);
		}
		System.out.println("traversing using for iterator");  //forward
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("traversing using for iterator-forward");
		ListIterator<String> itr1= al.listIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("traversing using iterator-backward");
		ListIterator<String> itr2 = al.listIterator(al.size());
		while (itr2.hasPrevious()) {
			System.out.println(itr2.previous());
		}
		System.out.println("traversing using foreach() method");
		al.forEach(a->System.out.println(a));
	}

}
