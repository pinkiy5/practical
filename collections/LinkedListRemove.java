package collectionpac;
import java.util.*;
public class LinkedListRemove {
	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<String>(); //create list 1
		l1.add("mishah");
		l1.add("abhishek");
		l1.add("aatif");
		l1.add("niladri");
		l1.add("soumya");
		l1.add("sourav");
		System.out.println("list 1 elements: "+l1);
		
		LinkedList<String> l2 = new LinkedList<String>(); //create list 2
		l1.add("pooja");
		l1.add("shifa");
		l1.add("elijah");
		System.out.println("list 2 elements: "+l2);
		
		//adding new element to list 1
		l1.addAll(l2);
		System.out.println("after adding new elements: "+l1);
		//removing specific elemet from arraylist 1
		l1.remove("niladri");
		System.out.println("after removing: "+l1);
		//removing specific element on basis of particular position
		l1.remove(1);
		System.out.println("aftter remove from specific position: "+l1);
		//remove all new elements of list 2
		l1.removeAll(l2);
		System.out.println("after removing all new elements: "+l1);
		//remove first element from list
		l1.removeFirst();
		System.out.println("after removing first element: "+l1);
		//remove last element from list
		l1.removeLast();
		System.out.println("after removing last element: "+l1);
		//adding new element to list 1
		l1.add("pinki");
		l1.add("sapna");
		l1.add("kapil");
		l1.add("java");
		l1.add("pinki");
		System.out.println("updated list elements: "+l1);
		//remove first occurrence of element
		l1.removeFirstOccurrence("pinki");
		System.out.println("after removing firt occurrence: "+l1);
		//remove last occurrence of element
		l1.removeLastOccurrence("pinki");
		System.out.println("after removing last  occurrence: "+l1);
		//traversing the list of elemnets in reverse order
		Iterator i = l1.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		//remove all elements
		l1.clear();
		Iterator<String> itr= l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

		
	}

}
