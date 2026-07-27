package DSA.LEETCODE;

import java.util.Arrays;

public class MaximumProductOfTwoElementsInAnArray {

     public int maxProduct(int[] nums) {

           int fastMaximum = 0;
           int secondMaximum = 0;

           for(int num : nums){

            if(num > fastMaximum){
                secondMaximum = fastMaximum;
                fastMaximum = num;
            }
            else if(num > secondMaximum)
                secondMaximum=num;

           }
           return (fastMaximum - 1)*(secondMaximum -1);
    }
}
