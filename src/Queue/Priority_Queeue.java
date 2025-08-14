package Queue;
import java.util.*;
public class Priority_Queeue {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());
		pq.add(30);
		pq.add(20);
		pq.add(50);
		pq.add(40);
		
		System.out.println(pq.peek());
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
			
		}
	}

}
