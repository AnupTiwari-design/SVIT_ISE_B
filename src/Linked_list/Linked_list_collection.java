package Linked_list;

import java.util.LinkedList;

public class Linked_list_collection {

	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<>();
		//insert at end
		list.add(2);
		list.add(3);
		list.add(4);
		
		//insert at begning
		list.addFirst(1);
		list.addFirst(6);
		
		System.out.println(list);
		
		list.removeFirst();
		list.removeLast();
		
		System.out.println(list);
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		
		list.add(3, 7);
		
		System.out.println(list);
		
	

	}

}
