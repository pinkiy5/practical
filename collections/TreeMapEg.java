package collectionpac;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class TreeMapEg {
	public static void main(String[] args) {
	TreeMap<Integer,String> map = new TreeMap<Integer,String>();
	map.put(101, "mango");
	map.put(108, "orange");
	map.put(105, "banana");
	map.put(103, "apple");
	map.put(105, "banana");
	//map.put(null,"chiku");
	map.put(107, null);
	System.out.println(map);
	map.putIfAbsent(102, "custardapple");
    map.putIfAbsent(101, "watermelon");
	System.out.println("--------------------------------------------");
    
    for(Map.Entry m : map.entrySet()) {
    	System.out.println(m.getKey()+" "+m.getValue());
    }
    
    map.remove(103);
    System.out.println("--------------------------------------------");
    System.out.println("after removal");
    for(Map.Entry m: map.entrySet()) {
    	System.out.println(m.getKey()+" "+m.getValue());

    }

}

}


