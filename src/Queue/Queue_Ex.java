package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Ex {

	public static void main(String[] args) {
		
		
		Queue<Integer>q=new LinkedList<>();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.offer(4);
		q.offer(5);
		
		System.out.println(q);
		
		System.out.println("Peak Element = "+q.peek());
		
		System.out.println("Removed Element = "+q.remove());
		
		System.out.println("Queue after removed = "+q);
		
		//poll (remove and return peak)
		
		System.out.println("Polled = "+q.poll());
		System.out.println("After poll "+q);
		
		System.out.println(q.isEmpty());

	}

}
