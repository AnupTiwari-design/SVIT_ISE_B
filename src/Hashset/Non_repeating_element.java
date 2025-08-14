package Hashset;
import java.util.HashMap;

public class Non_repeating_element {

	public static void main(String[] args)
	{
		
		HashMap<Integer,Integer> map =new HashMap<>();
		
		int arr[]= {1,2,3,1,2,4,5,5};
		
		for(int i:arr) {
			map.put(i,map.getOrDefault(i, 0)+1);
			
		}
		for(int key:map.keySet()) {
			if(map.get(key)==1) {
				System.out.println(key);
			}
		}
		
		
		
		
		
		
		

	}

}
