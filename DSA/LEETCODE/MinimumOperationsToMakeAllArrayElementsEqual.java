package DSA.LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class MinimumOperationsToMakeAllArrayElementsEqual {
    public static void main(String[] args) {

    }


    public List<Long> minOperations(int[] nums, int[] queries) {
        List<Long> ans = new ArrayList<>();
        for (int j = 0; j < queries.length; j++) {
            long operations = 0;
            for (int i = 0; i < nums.length; i++) {
                int currentValue = nums[i];
                while (currentValue != queries[j]) {
                    if (currentValue < queries[j]) {
                        currentValue++;
                    } else {
                        currentValue--;
                    }
                    operations++;
                }
            }
            ans.add(operations);
        }
    return ans;
    }
}
