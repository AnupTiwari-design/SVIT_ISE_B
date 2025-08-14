package collection;

import java.util.ArrayList;

public class Arraylist_teat {
	

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>(5);
		
		list.add(1);
		list.add(2);
		list.add(6);

		list.add(8);
		list.add(0);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		
		
		for(int i:list) {
			System.out.print(i);
		}
		
		System.out.println(list.size());
		//remove index value
		
		list.remove(5);
		
		
		System.out.println(list.get(5));
		list.set(5, 11);
		
		list.clear();
		

	}

}
