package DSA.NEETCODE_150;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {

        LongestRepeatingCharacterReplacement obj =
                new LongestRepeatingCharacterReplacement();

        System.out.println(obj.characterReplacement("ABAB", 2));      // 4
        System.out.println(obj.characterReplacement("AABABBA", 1));   // 4
    }

    public int characterReplacement(String s, int k) {

        int[] count = new int[26];

        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            count[s.charAt(right) - 'A']++;

            maxFreq = Math.max(maxFreq, count[s.charAt(right) - 'A']);

            while ((right - left + 1) - maxFreq > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}