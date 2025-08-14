package STACK;

import java.util.Stack;

public class Valid_parenthesis {
	
	
	static boolean check_valid(String str){
		
		Stack<Character> s=new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='['||ch=='{'||ch=='(') {
				s.push(ch);
			}
			
			else {
				if(s.isEmpty())return false;
				
				
				if(ch=='}'&&s.peek()=='{' || ch==']'&&s.peek()=='[' ||ch==')'&& s.peek()=='(')
					
					s.pop();
			}
			
		}
		return s.isEmpty();
		
		
	}

	public static void main(String[] args) {
		String str="{[()}}";
		
		if(check_valid(str)) {
			System.out.println("valid parenthesis");
		}
		else {
			System.out.println("not valid");
		}
		// TODO Auto-generated method stub

	}

}
