package Collection;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<Integer> stack1 = new Stack<Integer>();
		
		stack1.push(4);  //to add item to stack
		stack1.push(8);
		stack1.push(12);
		
		stack1.pop(); //pop will automatically remove the value on the top
		stack1.push(3);
		
		
		System.out.println(stack1);
		System.out.println(stack1.peek()); //shows the value on top
	}  

}
