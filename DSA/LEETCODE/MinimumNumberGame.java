package DSA.LEETCODE;

import java.util.Arrays;

public class MinimumNumberGame {
    public static void main(String[] args) {
        int[] nums = {5,4,2,3};
        int[] ans = numberGame(nums);

        System.out.println(Arrays.toString(ans));
    }
     public static int[] numberGame(int[] nums) {
         Arrays.sort(nums);
         int[] ans = new int[nums.length];

         for (int i = 0; i < nums.length; i+=2) {
             int aliceValue = nums[i];
             int bobValue = nums[i + 1];

            ans[i] = bobValue;
            ans[i + 1] = aliceValue;
         }
         return ans;
    }
}