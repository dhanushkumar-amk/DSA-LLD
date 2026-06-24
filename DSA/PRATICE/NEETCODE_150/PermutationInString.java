package DSA.PRATICE.NEETCODE_150;

import java.util.Arrays;

public class PermutationInString {
    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidbaooo")); // true
        System.out.println(checkInclusion("ab", "eidboaoo")); // false
    }

    public static boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);
        String sortedS1 = new String(arr1);

        int windowSize = s1.length();

        for (int i = 0; i <= s2.length() - windowSize; i++) {

            String sub = s2.substring(i, i + windowSize);

            char[] arr2 = sub.toCharArray();
            Arrays.sort(arr2);

            if (sortedS1.equals(new String(arr2))) {
                return true;
            }
        }

        return false;
    }
}