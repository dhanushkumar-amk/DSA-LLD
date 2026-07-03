package DSA.NEETCODE_150;

import java.util.Arrays;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        int[] nums1 = {100, 4, 200, 1, 3, 2};
        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};

        System.out.println(longestConsecutive(nums1)); // 4
        System.out.println(longestConsecutive(nums2)); // 9
    }

    public static int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < nums.length; i++) {

            // Duplicate value
            if (nums[i] == nums[i - 1]) {
                continue;
            }

            // Consecutive number
            if (nums[i] - nums[i - 1] == 1) {
                count++;
            } else {
                count = 1;
            }

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}