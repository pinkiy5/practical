package collectionpac;
import java.util.EmptyStackException;
import java.util.Stack;

public class StackEg1 {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();  //creating stack class
		System.out.println("stack: "+s);
		//pushing elements
		pushelement(s,15);
		pushelement(s,45);
		pushelement(s,20);
		pushelement(s,30);
        //popping elements
		popelement(s);
		popelement(s);
		//checking empty stack if yes throw exception
		try {
			popelement(s);
		}catch(EmptyStackException e) {
			System.out.println("stack empty");
		}
	    }
//push operation
	private static void pushelement(Stack<Integer> s, int i) {
		//invoke  push() method
		s.push(new Integer(i));
		System.out.println("push: "+i);
		System.out.println("stack: "+s); //modified stack
		

	}
//pop operation
	private static void popelement(Stack<Integer> s) {
		//invoke pop() method
		Integer i = (Integer)s.pop();
		System.out.println("pop: "+i);
		System.out.println("stack : "+s); //modified stack
	}

}
