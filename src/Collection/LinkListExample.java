package Collection;

import java.util.LinkedList;

public class LinkListExample {

	public static void main(String[] args) {
		
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("John");
		list1.add("Donald");
		list1.addLast("Harvey");
		list1.add("Jack");
		list1.add("Tom");
		list1.add("Harley");
		list1.addFirst("Johnny");
		list1.add(3, "Nomi");  //adding data using index
		
		System.out.println(list1);
		
		for (int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i) + " ");
		}
		
	}

}
