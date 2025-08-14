package STACK;
import java.util.Stack;

public class arraytostack {

	public static void main(String[] args) {
		Stack<Integer> s= new Stack<>();
		int arr[]= {2,6,3,5};
		for(int i=0;i<arr.length;i++) {
			s.push(arr[i]);
		
		}
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}
}
