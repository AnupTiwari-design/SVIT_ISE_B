package Hashset;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(7); // capacity 8 internally

        int[] nums = {10, 4, 19, 20};

        for (int num : nums) {
            set.add(num);
        }

        System.out.println("HashSet: " + set);

    
    }

}