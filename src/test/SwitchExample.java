package test;

public class SwitchExample {

	public static void main(String[] args) {
		
		String str1 = "Clean World Green World";
		int vowelCount = 0;
		
		for (int index=0; index<str1.length(); index++) {
			
			char temp = str1.charAt(index);
			
			switch(temp) {
			
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			vowelCount++;
			break;
			
			}
			}
		
		System.out.println("Total Vowel are: " +vowelCount);

	}

}
