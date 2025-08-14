package STACK;

import java.util.Stack;

public class Reverse_Stack {

	public static void main(String[] args) {
		
		
		
	Stack<Character> s=new Stack<>();
	
	String str="Hello";
	
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		s.push(ch);
	}
	System.out.println(s +" \n");
	
	while(!s.isEmpty()) {
		System.out.print(s.peek());
		s.pop();
		
	}

	}

}
