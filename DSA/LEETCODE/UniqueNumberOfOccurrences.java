package DSA.LEETCODE;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurrences {
    static void main(String[] args) {

    }


     public boolean uniqueOccurrences(int[] arr) {
           HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each number
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check if frequencies are unique
        HashSet<Integer> set = new HashSet<>();

        for (int freq : map.values()) {
            if (set.contains(freq)) {
                return false;
            }
            set.add(freq);
        }

        return true;
    }
}
