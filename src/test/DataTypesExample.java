package test;

public class DataTypesExample {

	public static void main(String[] args) {
		
		int num1 = 20;
		int num2 = 30;
		
		
		int sum = num1+num2;
		int sub = num2-num1;
		int mul = num1*num2;
		
		float div = (float) num2/num1;
		
		
		System.out.println("sum of two number is: " + sum);
		System.out.println("sum of two number is: " + sub);
		System.out.println("sum of two number is: " + mul);
		System.out.println("sum of two number is: " + div);
		
		String name = "Clean India Green India";
		System.out.println("Total num of chars are: " +name.length());

		System.out.println("Char at position: " +name.charAt(4)); //find the character of a particular position
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		System.out.println("Last char is: " + name.charAt(name.length()-1));  //find last character
	}

}
