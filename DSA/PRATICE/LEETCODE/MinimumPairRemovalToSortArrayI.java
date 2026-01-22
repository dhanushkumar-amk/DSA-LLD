package DSA.PRATICE.LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class MinimumPairRemovalToSortArrayI {
    public static void main(String[] args) {
        int[] nums = {5,2,3,1};
        System.out.println(minimumPairRemoval(nums));
    }

    public static int minimumPairRemoval(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int num : nums)
            list.add(num);

        int operation = 0;

        while (!isNonDecreasing(list)){
            int minSum = Integer.MAX_VALUE;
            int index = -1;

            for (int i = 0; i < list.size() - 1; i++) {
                int sum = list.get(i) + list.get(i + 1);

                if (sum < minSum){
                    minSum = sum;
                    index = i;
                }
            }

            // merge the pair
            int mergedValue = list.get(index) + list.get(index + 1);
            list.set(index, mergedValue);
            list.remove(index + 1);
            operation++;
        }
        return operation;
    }

    private static boolean isNonDecreasing(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i) < list.get(i - 1))
                return false;
        }
    return true;
    }
}
