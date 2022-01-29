package test;

public class WhileLoopExample {

	public static void main(String[] args) {
		
		int num=1;
		
		while (num<=10) {
			
			if (num==5) {
				num++;
				continue;
				
			}
			
			System.out.println(num);
			num++;
		}

	}

}
