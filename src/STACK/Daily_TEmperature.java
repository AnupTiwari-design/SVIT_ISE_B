package STACK;
import java.util.*;

public class Daily_TEmperature {
	 public static int[] daily_temperature(int[] temp) {
	        int n = temp.length;
	        int[] ans = new int[n];
	        Stack<Integer> s = new Stack<>();

	        for (int i = 0; i < n; i++) {
	            while (!s.isEmpty() && temp[i] > temp[s.peek()]) {
	                int prevIndex = s.pop();
	                ans[prevIndex] = i - prevIndex;
	            }
	            s.push(i);
	        }

	        return ans;
	    }
	

	public static void main(String[] args) {
		 int[] temp = {73, 74, 75, 71, 69, 72, 76, 73};
	        int[] result = daily_temperature(temp);

	        System.out.println("Days to wait for warmer temperature: ");
	        for (int day : result) {
	            System.out.print(day + " ");
	        }
	
		
		
	}
	}
