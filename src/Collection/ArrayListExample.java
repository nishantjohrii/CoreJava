package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<String> array1 = new ArrayList<>();

		array1.add("Nishant");
		array1.add("Raj");
		array1.add("Simi");
		array1.add("Jai");
		array1.add("Harsh");
		array1.add("Vardhan");

		System.out.println(array1.size());
		System.out.println(array1);

		// get particular index data
		System.out.println(array1.get(3));

		for (int i = 0; i < array1.size(); i++) {
			System.out.print(array1.get(i) + " ");
		}

		System.out.println(" ");

		for (int j = array1.size() - 1; j >= 0; j--) {
			System.out.print(array1.get(j) + " ");
		}

		System.out.println(" ");
		array1.remove(1);

		array1.set(3, "Nikunj");

		System.out.println(array1.size());
		System.out.println(array1);

		for (int i = 0; i < array1.size(); i++) {
			System.out.print(array1.get(i) + " ");
		}

		System.out.println(" ");

		for (String name : array1) {
			System.out.print(name + " ");
		}

		System.out.println(" ");
		Iterator<String> itr = array1.iterator();

		while (itr.hasNext()) {

			System.out.print(itr.next() + " ");
		}
		
		System.out.println(" ");
			
		//sort in ascending order
		Collections.sort(array1);
		System.out.print(array1 +" ");
		
	}

}
