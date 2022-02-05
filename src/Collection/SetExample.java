package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		
		HashSet<String> set1 = new HashSet<String>();   //does not maintain the order
		set1.add("name1");
		set1.add("name2");
		set1.add("name3");
		set1.add("name4");
		set1.add("name5");
		
		set1.add("name1");
		set1.add(null);
		
		System.out.println(set1);
		
		LinkedHashSet<String> set2 = new LinkedHashSet<String>();  //maintains the order
		set2.add("Mira");
		set2.add("Jack");
		set2.add("Tiger");
		set2.add("Dony");
		set2.add("Rumi");
		set2.add(null);
		
		System.out.println(set2);
		
		TreeSet<String> set3 = new TreeSet<String>();   //maintains the order in ascending order
		set3.add("Mira");
		set3.add("Jack");
		set3.add("Tiger");
		set3.add("Dony");
		set3.add("Rumi");
		
		System.out.println(set3);
		
		
	}
}