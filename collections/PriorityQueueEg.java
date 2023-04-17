package collectionpac;
import java.util.*;
public class PriorityQueueEg {
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("prakash");
		queue.add("ritu");
		queue.add("kamal");
		queue.add("deepak");
		queue.add("alok");
		queue.add("kajol");
		queue.add("prince");
		
		System.out.println("head: "+queue.element());
        System.out.println("queue: "+queue);
        System.out.println("head: "+queue.peek());
        System.out.println("queue: "+queue);
        System.out.println("iterating the elements");
        Iterator itr = queue.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        System.out.println("head: "+queue.poll());
        System.out.println("queue: "+queue);
        System.out.println("head: "+queue.remove());
        System.out.println("queue: "+queue);
        System.out.println("after removing");
        Iterator<String> itr1 = queue.iterator();
        while(itr1.hasNext()) {
        	System.out.println(itr1.next());
        }
	}

}
