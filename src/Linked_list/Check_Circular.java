package Linked_list;

public class Check_Circular {
	
	
	Node head;
	Check_Circular(){
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
	
	
	boolean check_circular() {
		Node temp=head.next;
		while(temp!=null&&temp!=head) {
			temp=temp.next;
		}
		if(temp==head) {
			return true;
		}
		else {
			return false;
		}
		
		
		
	}
	
	void makecircular() {
		
		
		if(check_circular()==true) {
		          System.out.println("it is circular");
					return;
			}
				Node temp=head;
			
			while(temp!=null) {
				temp=temp.next;
		
		}
			temp.next=head;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
