package DSA.LEETCODE;

public class FirstUniqueCharacterInAString {
    static void main() {
        System.out.println(firstUniqChar("leetcode"));
    }


    public static int firstUniqChar(String s) {
        int[] frequency  = new int[26];

       for(char character : s.toCharArray()){
           frequency[character - 'a']++;
       }

        for (int i = 0; i < s.length(); i++) {
            if (frequency[s.charAt(i) - 'a'] == 1)
                return i;
        }
       return -1;
    }
}
