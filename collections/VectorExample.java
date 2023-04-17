package collectionpac;
import java.util.Vector;
public class VectorExample {
	public static void main(String[] args) {
		//creating vector
		Vector<String> vc = new Vector<String>();
		//adding elements to vector
		vc.add("dog");
		vc.add("cat");
		vc.add("tiger");
		vc.add("lion");
		//checking size & capacity
		System.out.println("size: "+vc.size());
		System.out.println("capacity: "+vc.capacity());
		//add more elements
		vc.addElement("cow");
		vc.addElement("goat");
		System.out.println("after adding elements: ");
		System.out.println("size: "+vc.size());
		System.out.println("capacity: "+vc.capacity());
		//checking cat is present in the vector or not
		System.out.println(vc);
		if(vc.contains("cat")) {
			System.out.println("element present");
		} else {
			System.out.println("element not present");
		}
		//getting first element
		System.out.println("1st element: "+vc.firstElement());
		//getting last element
		System.out.println("last element: "+vc.lastElement());
		//checking index of specified element
		System.out.println("index: "+vc.indexOf("cat"));
	}

}
