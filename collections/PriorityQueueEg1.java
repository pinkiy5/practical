package collectionpac;
import java.util.PriorityQueue;
import java.util.Iterator;
public class PriorityQueueEg1 {
	public static void main(String[] args) {
		PriorityQueue<String> qu = new PriorityQueue<String>();
		qu.add("prakash");
		qu.add("ritu");
		qu.add("kamal");
		qu.add("deepak");
		qu.add("alok");
		qu.add("kajol");
		qu.add("prince");
		System.out.println("peek element: "+qu.peek());
		Iterator itr = qu.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		qu.remove();
		System.out.println("queue after removing the element");
		Iterator itr1 = qu.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
