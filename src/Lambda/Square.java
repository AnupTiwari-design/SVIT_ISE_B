interface Square {
    int square(int x);
}

public class LambdaExample {
    public static void main(String[] args) {
        Square sq = (x) -> x * x;
        System.out.println(sq.square(5));  // Output: 25
    }
}

List<Integer> list = Arrays.asList(3, 1, 2);
list.sort((a, b) -> a - b);