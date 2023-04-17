package collectionpac;
import java.util.EmptyStackException;
import java.util.Stack;
public class StackEg {
	public static void main(String[] args) {
		//creating stack class
		Stack<Integer> s = new Stack<>();
		//checking empty or not
		boolean result = s.isEmpty();
		System.out.println("is the stack empty ? "+result);
		//adding element (push)
		s.push(25);
		s.push(35);
		s.push(40);
		s.push(55); // 2
		s.push(80); // 1
		s.push(75); //top value 0
		System.out.println("stack element: "+s); // result
		Integer digit = s.peek(); //access element from top of the stack
		System.err.println("top element: "+digit);
		System.out.println("stack element after peek: "+s);
		Integer digit2 = s.pop();
		System.err.println("top element : "+digit2);
		System.out.println("stack element after pop: "+s);
		int digit1 = s.search(35);// search any element
	    System.out.println("search element: "+digit1);
	    int x = s.size(); //find size of stack
	    System.out.println("stack size: "+x);
	    result=s.empty(); //checking empty or not
	    System.out.println("is stack empty: ? "+result);
		

		
	}

}
