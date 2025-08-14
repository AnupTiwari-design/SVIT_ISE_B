package STACK;

import java.util.Stack;

import Linked_list.Node;

public class Pallindrome {
	
	Node head;
	
	Pallindrome(){
		head=null;
	}
	void insert_at_end(int data) {
		
		Node newnode=new Node(data);
		
		if(head==null) {
			head=newnode;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newnode;
	}
	
	boolean check_pallindrome() {
		
		Stack<Integer> s=new Stack<>();
		
		Node temp=head;
		while(temp!=null) {
			s.push(temp.data);
			
			temp=temp.next;
			
		}
		temp=head;
		while(temp!=null&&!s.isEmpty()) {
			
			if(s.peek()!=temp.data)
				return false;
		
		s.pop();
		temp=temp.next;
		}
		return s.isEmpty();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pallindrome ob =new Pallindrome();
		
		ob.insert_at_end(1);
		ob.insert_at_end(2);
		ob.insert_at_end(1);
		
		if(ob.check_pallindrome()==true) {
			System.out.println("pallindrome ");
		}
		else {
			System.out.println("not pallindrome");
		}
		

	}

}
