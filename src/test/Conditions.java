package test;

import java.util.Scanner;

public class Conditions {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.err.println("Enter your Age");
		
		int age = scanner.nextInt();
		if (age >=18) {
			System.out.println("you are eligible for voting");
		}
		else if (age ==17) {
			System.out.println("you are eligible for voting from next year");
		}
		else {
			System.out.println("you are not eligible for voting");
		}
		
		scanner.close();
	}

}
