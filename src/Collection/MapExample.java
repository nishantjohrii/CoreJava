package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {

		HashMap<Integer, String> map1 = new HashMap<Integer, String>();

		map1.put(1, "Suraj");
		map1.put(2, "Manoj");
		map1.put(3, "Shubham");
		map1.put(4, "Preeti");

		System.out.println(map1);
		
		
		for(Map.Entry<Integer, String> entry1 : map1.entrySet()) {	
			System.out.println(entry1.getKey()+" " +entry1.getValue());
		}
		
		System.out.println("=================");
		
		Set<Integer> set1 = map1.keySet();
		for(Integer var: set1) {
			System.out.print(var+" ");
		}
		
		System.out.println(" ");
		
		
	
		map1.put(1, "John");

		System.out.println(map1);

		// delete the entry
		map1.remove(1);
		System.out.println(map1);

		LinkedHashMap<Integer, String> map2 = new LinkedHashMap<Integer, String>();

		map2.put(1, "Suraj");
		map2.put(2, "Manoj");
		map2.put(3, "Shubham");
		map2.put(4, "Preeti");
		
		System.out.println(map2);
		
		
		TreeMap<Integer, String> map3 = new TreeMap<Integer, String>();

		map3.put(1, "Suraj");
		map3.put(2, "Manoj");
		map3.put(4, "Preeti");
		map3.put(3, "Shubham");
		
		
		System.out.println(map3);
	}

}
