package collectionpac;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
public class ArrayDequeEg {
	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<String>();
		dq.add("prakash");
		dq.add("ritu");
		dq.add("kamal");
		dq.add("deepak");
		dq.add("alok");
		dq.add("kajol");
		dq.add("prince");
		System.out.println(dq);
		dq.addFirst("shree");
		dq.addLast("riya");
		System.out.println("new list");
		for(String s1:dq) {
			System.out.println(s1);
		}
		dq.removeFirst();
		dq.removeLast();
		System.out.println("new list after removal");
		for(String s2:dq) {
			System.out.println(s2);
		}
	}

}
