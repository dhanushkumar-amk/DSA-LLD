package DSA.LEETCODE;

import java.util.HashMap;

public class SingleNumber2 {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            if (map.get(num) == 1) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        SingleNumber2 obj = new SingleNumber2();
        int[] nums = {2, 2, 3, 2};

        System.out.println(obj.singleNumber(nums));
    }
}