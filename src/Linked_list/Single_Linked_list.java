package Linked_list;

public class Single_Linked_list {
	
	Node head;
	
	Single_Linked_list(){
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
	
	void display() {
		
		if(head==null) {
			System.out.println("list is empty");;
			return;
		}
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data +" ->");
			temp=temp.next;
		}
		System.out.print("null \n");
	}
	
	void insert_at_beg(int data) {
		Node newnode=new Node(data);
		newnode.next=head;
		head=newnode;
	}
	void delete_at_end() {
		// empty
		if(head==null) {
			System.out.println("list is empty");
			return ;
		}
		//single node;
		 if(head.next==null) {
			 head=null;
			 return ;
			 
		 }
		 Node temp=head;
		 
		 while(temp.next.next!=null) {
			 temp=temp.next;
		 }
		 temp.next=null;
	}
	
	void delete_at_beg() {
		
		if(head==null) {
			System.out.println("list i sempty");
			return;
		}
		
		head=head.next;
		
		
	}
	void reverse() {
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		
		Node next;
		Node prev=null;
		Node curr=head;
		
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
	}
	
	void insert_at_position(int data,int pos) {
		
		Node newnode=new Node(data);
		
		if(pos<0) {
			System.out.println("invalid position");
			return;
			
		}
		if(pos==0) {
			
			newnode.next=head;
			head=newnode;
			return;
			
		}
		Node curr=head;
		int index=0;
		while(curr!=null&&index<pos-1) {
			curr=curr.next;
			index++;
		}
		
		if(curr==null) {
			System.out.println("position out of range");
			return;
		}
		newnode.next=curr.next;
		curr.next=newnode;
	}
	
	void delete_at_pos(int pos) {
		if(pos<0) {
			System.out.println("invalid position");
			return;
			
		}
		if(pos==0) {
			
		 head=head.next;
			
		}
		Node curr=head;
		int index=0;
		while(curr!=null&&index<pos-1) {
			curr=curr.next;
			index++;
		}
		
		if(curr==null) {
			System.out.println("position out of range");
			return;
		}
		
		curr.next=curr.next.next;
		
		
		
	}

	public static void main(String[] args) {
		
		Single_Linked_list ob=new Single_Linked_list();
		
		ob.insert_at_end(1);
		ob.insert_at_end(2);
		ob.insert_at_end(3);
		ob.display();
		
		ob.insert_at_beg(8);
		ob.insert_at_beg(9);
		ob.display();
		
		ob.delete_at_end();
		ob.display();
		
		ob.delete_at_beg();
		ob.display();
		
		ob.reverse();
		ob.display();
		
		ob.insert_at_position(9, 1);
		ob.display();
		
		ob.delete_at_pos(2);
		ob.display();
		// TODO Auto-generated method stub

	}

}
