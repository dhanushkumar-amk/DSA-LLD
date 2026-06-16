package DSA.PRATICE.NEETCODE_150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> result = groupAnagrams(strs);

        for (List<String> group : result) {
            System.out.println(group);
        }
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        HashMap<String, List<String>> hashMap = new HashMap<>();

        for (String s : strs) {

            int[] frequency = new int[26];

            for (char c : s.toCharArray()) {
                frequency[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < 26; i++) {
                sb.append('#');
                sb.append(frequency[i]);
            }

            String key = sb.toString();

            hashMap.putIfAbsent(key, new ArrayList<>());
            hashMap.get(key).add(s);
        }

        return new ArrayList<>(hashMap.values());
    }
}