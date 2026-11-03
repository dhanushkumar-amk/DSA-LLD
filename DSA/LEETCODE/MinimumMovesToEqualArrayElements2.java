package DSA.LEETCODE;

import java.util.Arrays;

public class MinimumMovesToEqualArrayElements2 {
     public int minMoves2(int[] nums) {
         Arrays.sort(nums);
         int mid = nums[nums.length / 2];

         int sum = 0;
         for (int num : nums){
             sum += Math.abs(num - mid);
         }
         return sum;
    }
}
