package DSA;
import java.util.*;
public class Binary_search {
	
	
	static int binary(int arr[],int k) {
		
		int n=arr.length;
		int l=0;
		int h=n-1;
		while(l<=h) {
			int mid=(l+h)/2;
			if(arr[mid]==k){
				return mid+1;
			}
			else if(arr[mid]<k) {
				l=mid+1;
			}
			else {
				h=mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {4,5,8,9,10};
		int k=9;
		if(binary(arr,k)!=-1) {
			System.out.println("element found");
		}
		else {
			System.out.println("not found");
		}
			
		}

	

}
