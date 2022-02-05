package Collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		
		PriorityQueue<String> pq1 = new PriorityQueue<String>();
		
		pq1.add("Daniel");
		pq1.add("Nik");
		pq1.add("Sonal");
		pq1.add("Liz");
		
		System.out.println(pq1);
		
		System.out.println(pq1.peek());
		
		System.out.println(pq1.poll()); 
		
		System.out.println(pq1);
		
		System.out.println("========================================");
		
		ArrayDeque<String> dq1 = new ArrayDeque<String>();
		
		dq1.add("Daniel");
		dq1.add("Nik");
		dq1.add("Sonal");
		dq1.add("Liz");
		
		System.out.println(dq1);
		System.out.println(dq1.peek());
		System.out.println(dq1.peekFirst());
		System.out.println(dq1.peekLast());
		
		System.out.println(dq1.poll());
		System.out.println(dq1.pollFirst());
		System.out.println(dq1.pollLast());
		
		System.out.println(dq1);
	}

}
