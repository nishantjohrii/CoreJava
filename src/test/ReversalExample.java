package test;

public class ReversalExample {

	public static void main(String[] args) {

		
		//reversal of String
		String str1 = "Clean India Green India";
		String revStr = "";

		for (int rev = str1.length() - 1; rev >= 0; rev--) {

			revStr = revStr + str1.charAt(rev);

		}
		System.out.println(revStr);
	
		//reversal of an array
		int[] num = { 10, 20, 30, 40, 50 };

		for (int i = num.length - 1; i >=0; i--) {
			
			System.out.print(num[i] + " ");
		}
			
			System.out.println(" ");
			//reversal of an integer
		int num5 = 97678971;
		int rev = 0;		
		
		while (num5>0) {
			int remainder = num5%10;
			rev = rev*10 + remainder;
			num5 = num5/10;
			
		}
		System.out.println(rev);
			
		
	}

}
