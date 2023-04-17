package collectionpac;
import java.util.*;
public class LinkedListMethod {
	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<String>(); //create list 1
		l1.add("mishah");
		l1.add("abhishek");
		l1.add("aatif");
		l1.add("niladri");
		l1.add("soumya");
		l1.add("sourav");
		System.out.println("list 1 elements: "+l1);
		//retrieve 1 element of list -- by default
		System.out.println(l1.peek());
		//retrieve 1 element of list
		System.out.println(l1.peekFirst());
		//retrieve last element of list
		System.out.println(l1.peekLast());
		//retrieve & remove 1 element of list --by default
		System.out.println(l1.poll());
		System.out.println("list 1 elements: "+l1);
		//retrieves 1 element of list
		System.out.println(l1.pollFirst());
		System.out.println("list 1 elements: "+l1);
        //retrieves last element of list
		System.out.println(l1.pollLast());
		System.out.println("list 1 elements: "+l1);
        System.out.println(l1.pop());
		System.out.println("list 1 elements: "+l1);

		
	}

}
