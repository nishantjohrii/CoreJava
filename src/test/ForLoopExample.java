package test;

public class ForLoopExample {

	public static void main(String[] args) {
		
		for (int count=1; count<=10; count++) {
			
			if (count ==5) {
				continue;
			}
			
			System.err.println("inside for loop: " + count);
		}
		
		for (int num=10; num>=1; num--) {
			
			System.out.println(num);
		}

	}

}
