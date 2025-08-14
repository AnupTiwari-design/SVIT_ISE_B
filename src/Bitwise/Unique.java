package Bitwise;

public class Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]= {1,2,3,1,2};
		int u=0;
		
		for(int i=0;i<arr.length;i++) {
			u=u^arr[i];
		}
		System.out.println(u);

	}

}
