package collectionpac;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
public class Arraydequedemo {
	public static void main(String[] args) {
		//creating & adding
		Deque<String> dq = new ArrayDeque<String>();
		dq.add("prakash");
		dq.add("ritu");
		dq.add("kamal");
		dq.add("deepak");
		dq.add("alok");
		System.out.println("after offer first");
		//traversing
		for(String str:dq) {
			System.out.println(str);
		}
		dq.offerLast("monalisa");
		System.out.println("after offer last");
		//traversing
		for(String str1:dq) {
			System.out.println(str1);
		}
		
		//dq.peek() & dq.peekFirst same as peek()
		System.out.println("peek: "+dq.peek());
		System.out.println("peek first: "+dq.peekFirst());
		System.out.println("peek last: "+dq.peekLast());
		System.out.println("after peek");
		for(String str1:dq) {
			System.out.println(str1);
		}
		//dq.poll() & dq.pollFirst() same as poll()
		System.out.println("poll: "+dq.poll());
		System.out.println("poll first: "+dq.pollFirst());
		System.out.println("poll last: "+dq.pollLast());
		System.out.println("after poll");
		for(String str2:dq) {
			System.out.println(str2);
		}
	}

}
