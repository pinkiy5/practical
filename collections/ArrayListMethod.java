package collectionpac;
import java.util.*;
public class ArrayListMethod {
public static void main(String[] args) {
	List<String> al = new ArrayList<String>();
    al.add("ram");
    al.add("sam");
    al.add("rose");
    al.add("lisa");
    al.add("david");
    al.add("maria");
    Collections.sort(al);
    System.out.println("traversing");
    for(String name:al) {
    	System.out.println(name);
    }
    String element = al.get(2);  //get() method
    System.out.println("get index : "+element);
    System.out.println("array list is: "+al.isEmpty());
    String element1 = al.remove(4);
    System.out.println("remove index: "+element1);
    System.out.println("traversing using for loop");
    for(int i =0;i<al.size();i++) {
    	System.out.println(al.get(i));
    }
}
}
