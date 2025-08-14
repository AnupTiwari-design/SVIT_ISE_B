package DSA;

public class Square_root {
	
	int sqrtBinarySearch(int n) {
	    if (n < 2) return n;

	    int low = 1, high = n, ans = 0;

	    while (low <= high) {
	        int mid = low + (high - low) / 2;
	        int square = mid * mid;

	        if (square == n)
	            return mid;
	        else if (square < n) {
	            ans = mid;         
	            low = mid + 1;
	        } else {
	            high = mid - 1;
	        }
	    }

	    return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
