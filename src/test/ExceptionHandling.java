package test;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int num =10;
		
		try {
			int result = num/0;
			System.out.println(result);
		}catch (Throwable t) {
			
			System.out.println("Inside catch block");
		}
		
		System.out.println("Outside try and catch block");
	}

}
