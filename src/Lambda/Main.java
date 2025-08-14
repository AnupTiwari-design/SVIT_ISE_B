package Lambda;

public class Main {

	public static void main(String[] args) {
		
		MathOperation add=(a,b) -> a+b;
		
		MathOperation mul=(a,b) -> a*b; 
		
		System.out.println(add.operate(5, 8));
		
		System.out.println(mul.operate(8, 5));

	}

}
