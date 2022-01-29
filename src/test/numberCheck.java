package test;

import java.util.Scanner;

public class numberCheck {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = scanner.nextInt();

		if (num%2 == 0) {
			
			System.out.println("Number is even number");
			
		}
		else {
			System.out.println("Number is odd number");
		}
		scanner.close();
	}
	

}
