package Bitwise;

public class TwoUniqueno {
	
	static void twounique(int arr[]) {
		int u=0;
		for(int nums:arr) {
			u=u^nums;
			
		}
		int rsb=u&-u;
		int a=0,b=0;
		for(int nums:arr) {
			if((nums&rsb)==0) {
				a=a^nums;
			}
			else {
				b=b^nums;
			}
		}
		System.out.println(a + " "+ b);
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,1,2,4};
		

	}

}
