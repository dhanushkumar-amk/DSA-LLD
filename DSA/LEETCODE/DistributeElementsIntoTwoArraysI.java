package DSA.LEETCODE;

import java.util.ArrayList;

public class DistributeElementsIntoTwoArraysI {

     public int[] resultArray(int[] nums) {
       if(nums.length <= 2)
           return nums;

         ArrayList<Integer> list1 = new ArrayList<>();
         ArrayList<Integer> list2 = new ArrayList<>();

         list1.add(nums[0]);
         list2.add(nums[1]);

         for (int i = 2; i < nums.length; i++) {
             if (list1.get(list1.size() - 1) > list2.get(list2.size() - 1)){
                 list1.add(nums[i]);
             }else{
                 list2.add(nums[i]);
             }
         }

         int[] ans = new int[nums.length];

         int i = 0;
          for(int val : list1){
              ans[i++] = val;
          }

          for(int val : list2)
            ans[i++] = val;

         return ans;

    }


}
