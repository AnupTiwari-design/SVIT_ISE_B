package Hashset;
import java.util.*;

public class Anagram_check {

	

    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        HashMap<Character, Integer> freqMap = new HashMap<>();

        // Count frequency of characters in s1
        for (char c : s1.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Decrease frequency for characters in s2
        for (char c : s2.toCharArray()) {
            if (!freqMap.containsKey(c)) return false;

            freqMap.put(c, freqMap.get(c) - 1);

            if (freqMap.get(c) < 0) return false;
        }

        return true; // All counts matched
    }
    public static void main(String[] args) {
		

		String str1 = "listen";
        String str2 = "silent";

        System.out.println(areAnagrams(str1, str2) ? "Anagrams" : "Not Anagrams");
    }
}
