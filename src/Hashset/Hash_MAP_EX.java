package Hashset;
import java.util.*;
public class Hash_MAP_EX {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> map=new HashMap<>();
		
		map.put("a", 3);
		map.put("b", 4);
		map.put("c",6);
		
		System.out.println(map.get("a"));
		
		System.out.println(map.getOrDefault("d", 9));
		
		//to access all keys 
		
		System.out.println(map.keySet());
		
		
		map.remove("a");
		
		
		
		
	
		

	}

}
