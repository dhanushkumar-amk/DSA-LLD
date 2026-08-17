package DSA.LEETCODE;

public class MaximumScoreAfterSplittingString {
    static void main(String[] args) {
        String s = "00111";

        System.out.println(maxScore(s));
    }

    public static int maxScore(String s) {
        int maxCount = 0;

        for (int mid = 1; mid < s.length(); mid++) {
            int left =0;
            int right = mid + 1;

            int zeroCount = 0;
            int oneCount = 0;

            while (left < mid) {
                if (s.charAt(left) == '0')
                    zeroCount++;

                left++;
            }

            while (right < s.length()) {
                if (s.charAt(right) == '1')
                    oneCount++;

                right++;
            }

            int countSum = zeroCount + oneCount;
            maxCount = Math.max(maxCount, countSum);
        }
        return maxCount;
    }
}