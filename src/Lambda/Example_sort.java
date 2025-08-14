package Lambda;


import java.util.Arrays;

public class Example_sort {

	public static void main(String[] args) {
		
		String name[]= {"John","Amit","Zara","Bob"};
		
		Arrays.sort(name,(a,b)->a.compareTo(b));
		
		System.out.println(Arrays.toString(name));
		
		
		
		

	}

}
