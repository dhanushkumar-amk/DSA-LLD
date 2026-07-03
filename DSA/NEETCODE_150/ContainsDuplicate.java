package DSA.NEETCODE_150;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        boolean ans = containsDuplicate(nums);
        System.out.println(ans);
    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1])
                return true;
        }
        return false;
    }


//    optimal approach
     public static boolean containsDuplicate1(int[] nums) {
         HashSet<Integer> hashSet = new HashSet<>();

         for(int num : nums){
             if (hashSet.contains(num))
                 return true;
             else
                 hashSet.add(num);
         }
         return false;
    }
}

