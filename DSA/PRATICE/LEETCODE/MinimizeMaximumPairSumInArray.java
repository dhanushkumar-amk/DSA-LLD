package DSA.PRATICE.LEETCODE;

import java.util.Arrays;

public class MinimizeMaximumPairSumInArray {
    public static void main(String[] args) {

    }

    public static int minPairSum(int[] nums) {
        int ans = 0;
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();
        ans = max + min;
        return ans;
    }
}
