package collectionpac;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
public class HashMapEg {
	public static void main(String[] args) {
		//creating map
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(101, "mango");
		map.put(108, "orange");
		map.put(105, "banana");
		map.put(103, null);
		map.put(null, null);
		map.put(102, null);
		map.put(null, "apple");
		map.put(109, "lichi");
		
		//traversing
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("--------------------------------------------");
	    map.putIfAbsent(102, "custardapple");
	    map.putIfAbsent(101, "watermelon");
	    for(Map.Entry m : map.entrySet()) {
	    	System.out.println(m.getKey()+" "+m.getValue());
	    }
	    //map.remove(103);
	    //System.out.println(map);
	    //key
	    System.out.println("keys: "+map.keySet());
	    //value
	    System.out.println("vaues: "+map.values());
	    //key-value
	    System.out.println("keys & values: "+map.entrySet());
	    map.remove(103);
	    System.out.println("after removal");
	    for(Map.Entry m: map.entrySet()) {
	    	System.out.println(m.getKey()+" "+m.getValue());
	
	    }

	}

}
