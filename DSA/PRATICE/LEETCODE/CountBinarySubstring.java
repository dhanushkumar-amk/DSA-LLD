package DSA.PRATICE.LEETCODE;

public class CountBinarySubstring {
    public static void main(String[] args) {

    }

    public  int countBinarySubstrings(String s) {
        int count = 0;
        int preGroup = 0;
        int currentGroup = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1))
                currentGroup++;
            else{
                count += Math.min(preGroup, currentGroup);
                preGroup = currentGroup;
                currentGroup = 1;
            }
        }
        // for last element
        count += Math.min(preGroup, currentGroup);
        return count;
    }
}
