package DSA;
import java.util.Scanner;

public class LInear_search {
	
	static void liner(int arr[],int n,int k) {
		for(int i=0;i<n;i++) {
			if(arr[i]==k) {
				System.out.println(i+1);
				return;
			}
			
		}
		System.out.println("not found");
	}

	public static void main(String[] args) {
		
		Scanner ob=new Scanner(System.in);
		int n;
		System.out.println("enter size of array");
		n=ob.nextInt();
		int arr[]=new int[n];
		System.out.println("enter element in array =");
		for(int i=0;i<n;i++) {
			arr[i]=ob.nextInt();
			
		}
		int k;
		System.out.println("enter element to search =");
		k=ob.nextInt();
		
		liner(arr,n,k);

	}

}
