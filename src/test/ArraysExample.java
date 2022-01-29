package test;

public class ArraysExample {

	public static void main(String[] args) {
		
		int[] num1 = {10,20,30,40,50};
		
		System.err.println("Total values are: "+num1.length);
		System.out.println("value at 3rd position: "+num1[2]);
		System.out.println("value ar last position: "+num1[num1.length-1]);
		
		String name = "Clean India Green India";
		
		String[] arrWords = name.split(" ");   //split method
		
		System.out.println("Value at 4th position is: "+arrWords[3]);
		System.out.println("Total number of words are: "+arrWords.length);    //output is 4
		
		
		
	}

}
