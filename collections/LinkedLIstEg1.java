package collectionpac;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedLIstEg1 {
	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<String>(); //create list
	    l1.add("pinki");
	    l1.add("aaarti");
	    l1.add("pallabii");
	    l1.add("sapna");
	    l1.add("kajol");
	    l1.add("versha");
	    l1.add("amrit");
	    System.out.println(l1);
	    Iterator<String>itr=l1.iterator();
	    while(itr.hasNext())
	    	System.out.println(itr.next());
	    
	    //adding an element at the specific position
	    l1.add(2,"nisha"); //add(int index,element)
	    System.out.println("after adding: "+l1);
	    
		LinkedList<String> l2 = new LinkedList<String>(); //create list
        l2.add("peso");
        l2.add("shifa");
        l2.add("elijah");
        System.out.println("list 2 elements: "+l2);
        
        //adding all 2 list elements to the 1 list
        l1.addAll(l2);
        System.err.println("after adding all elements of list2: "+l1);
        //adding all 2 list elements to 1 list at a specific position
        l1.addAll(2, l2);
        System.out.println("after adding all elements of list 2 at specific position: "+l1);
        //adding element at first position
        l2.addFirst("shobha");
        System.err.println("add element at first: "+l2);
        //adding element at last position
        l2.addLast("karan");
        System.err.println("add element at last: "+l2);


	}

}
