package collectionpac;
import java.util.*;
public class ArrayListConvert {
public static void main(String[] args) {
	//	ArrayList all = new ArrayList();  //non-generic
	//creating an arraylist - generic

	ArrayList<String> al = new ArrayList<String>();
	al.add("rose");
	al.add("sunflower");
	al.add("lily");
	al.add("daisy");
	al.add("marigold");
	al.add("tulip");
	al.add("jasmin");
	//conversion of list to array
	System.out.println("list to array");
	//toArray() method used to convert list to array
	String arr[] = al.toArray(new String[al.size()]);
	for(String s :arr) { //traversing using for each
		System.out.println(s);
	}
	
	//array to list
	System.out.println("array to list");
	List<String> all = new ArrayList<String>();
	all=Arrays.asList(arr); //aslist method convert array to list
	System.out.println(all);
	
}
}
