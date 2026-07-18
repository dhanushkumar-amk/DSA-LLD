package DSA.LEETCODE;

public class FindGreatestCommonDivisorOfArray {

     public int findGCD(int[] nums) {
         int maxElement = Integer.MIN_VALUE;
        int minElement = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            maxElement = Math.max(maxElement, nums[i]);
            minElement = Math.min(minElement, nums[i]);
        }

        int gcd = 1;

        for (int i = 1; i <= minElement; i++) {
            if (minElement % i == 0 && maxElement % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }
}
