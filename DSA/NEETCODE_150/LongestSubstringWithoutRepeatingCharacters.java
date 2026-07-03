package DSA.NEETCODE_150;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(lengthOfLongestSubstring("bbbbb"));    // 1
        System.out.println(lengthOfLongestSubstring("pwwkew"));   // 3
        System.out.println(lengthOfLongestSubstring(""));         // 0
    }

    public static int lengthOfLongestSubstring(String s) {

        if (s == null || s.length() == 0)
            return 0;

        int left = 0;
        int right = 0;
        int ans = 0;

        HashSet<Character> hashSet = new HashSet<>();

        while (right < s.length()) {
            char character = s.charAt(right);

            while (hashSet.contains(character)) {
                hashSet.remove(s.charAt(left));
                left++;
            }

            hashSet.add(character);
            ans = Math.max(ans, right - left + 1);
            right++;
        }

        return ans;
    }
}