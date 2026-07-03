package DSA.NEETCODE_150;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums= {2,7,11,15};
        int[] ans = twoSum(nums, 9);
        System.out.println(Arrays.toString(ans));
    }


    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];

            if (hashMap.containsKey(value)){
                return new int[]{hashMap.get(value), i};
            }

            hashMap.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
