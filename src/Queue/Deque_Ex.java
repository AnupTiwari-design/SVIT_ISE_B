package Queue;
import java.util.*;
public class Deque_Ex {

	public static void main(String[] args) {
		
		Deque<Integer> dq=new ArrayDeque<>();
		
		//Scanner ob=new Scanner(System.in);
		
		dq.addLast(10);
		dq.addFirst(20);
		dq.addFirst(30);
		dq.add(40);
		
		System.out.println(dq);
		
		System.out.println(dq.peekFirst());
		System.out.println(dq.peekLast());
		dq.removeFirst();
		dq.removeLast();
		System.out.println(dq);
		
	
		

	}

}
