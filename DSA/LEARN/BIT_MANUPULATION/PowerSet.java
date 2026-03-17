package DSA.LEARN.BIT_MANUPULATION;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.size(); j++) {
                System.out.println(ans.get(i).get(j));
            }
        }
    }


     public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        int n = nums.length;
        int subsets = 1 << n;

        for (int num = 0; num < subsets; num++) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((num & (1 << i)) != 0) {
                    list.add(nums[i]);
                }
            }
            answer.add(list);
        }

        return answer;
    }
}
