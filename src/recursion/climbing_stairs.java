package recursion;

public class climbing_stairs {
	
	public static int climb(int n) {
		if(n<=1) {
			return 1;
		}
		return climb(n-1)+climb(n-2);
	}

	public static void main(String[] args) {
		
		
		System.out.println(climb(5));
		// TODO Auto-generated method stub

	}

}
