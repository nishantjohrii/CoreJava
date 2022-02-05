package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Assignment {

	public static void main(String[] args) {
		String str1 = "Clean World Green World";     //output : Clean World Green
	
		String[] str2 = str1.split(" ");
		
		HashSet<String> set = new HashSet<String>(Arrays.asList(str2));
		
		for (String word:set) {
			System.out.print(word +" ");
		}
		
	}

}
