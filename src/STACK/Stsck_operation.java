package STACK;

import java.util.Stack;

public class Stsck_operation {

	public static void main(String[] args) {
		
		Stack<Integer> s=new Stack<>();
		
		s.push(1);
		
		s.push(2);
		s.push(3);
		
		System.out.println(s);
		System.out.println("top element ="+ s.peek() );
		
		int poped=s.pop();
		System.out.println("popped="+poped);
		
		System.out.println("stack after pop ="+s);
		
		System.out.println("check stack is empty ="+s.isEmpty());
		
		System.out.println("position of 2="+s.search(2));
		

	}

}
