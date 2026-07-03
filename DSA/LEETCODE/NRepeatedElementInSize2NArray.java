package DSA.LEETCODE;

// problem url => https://leetcode.com/problems/n-repeated-element-in-size-2n-array/description/?envType=daily-question&envId=2026-01-02
// problem name => N-Repeated Element in Size 2N Array (leetcode)


import java.util.HashMap;

public class NRepeatedElementInSize2NArray {

    public static void main(String[] args) {
        int[] nums = {5,1,5,2,5,3,5,4};
        int ans = repeatedNTimes(nums);
        System.out.println(ans);
    }

    public static int repeatedNTimes(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>(0);
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);

            if(map.get(num) > 1)
                return num;
        }
        return -1;
    }
}
