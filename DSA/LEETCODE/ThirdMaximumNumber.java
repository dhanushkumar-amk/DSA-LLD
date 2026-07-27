package DSA.LEETCODE;

import java.util.Arrays;

public class ThirdMaximumNumber {
    
     public int thirdMax(int[] nums) {

        Arrays.sort(nums);

        if(nums.length <= 2)
            return nums[nums.length - 1];


        int firstMaximum = Integer.MIN_VALUE;
        int secondMaximum = Integer.MIN_VALUE;
        int thirdMaximum = Integer.MIN_VALUE;

         for (int i = nums.length - 1; i >= 0 ; i--) {
             if (nums[i] > firstMaximum){
                 thirdMaximum = secondMaximum;
                 secondMaximum = firstMaximum;
                 firstMaximum = nums[i];
             }
             else if(nums[i] >= secondMaximum){
                 thirdMaximum = secondMaximum;
                 secondMaximum = nums[i];
             }else{
                 thirdMaximum = nums[i];
             }

         }
         return thirdMaximum;
    }
}
