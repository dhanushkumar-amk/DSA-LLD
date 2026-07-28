package COLLEGE_PLACEMENT.DIGIT_MANUPULATION.TASK4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BuildArrayFromPermutation {
    static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};

        int[] ans = buildArraySimple(nums);

        System.out.println(Arrays.toString(ans));
    }


   public static int[] buildArraySimple(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
