package DSA;
import java.util.Scanner;

public class Pallindrome_string {
	
	public static  boolean ispallindrome(String str) {
		   str=str.toLowerCase();
		   int start=0;
		   int end=str.length()-1;
		   while(start<end) {
			   if(str.charAt(start)!=str.charAt(end)) {
				   return false;
			   }
			   start++;
			   end--;
		   }
		   return true;
		   
	   }
	

	public static void main(String[] args) {
		String str;
		Scanner ob =new Scanner(System.in);
		System.out.println("Enter string to check =");
		str=ob.nextLine();
		if(ispallindrome(str)) {
			System.out.println("pallindrome string");
			
		}
		else{
			System.out.println("not pallindrome");
		}
		

	}

}
