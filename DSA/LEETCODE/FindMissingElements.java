package DSA.LEETCODE;

import java.util.*;

public class FindMissingElements {
    static void main(String[] args) {

    }

    public List<Integer> findMissingElements(int[] nums) {

        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();

        Set<Integer> set = new TreeSet<>();
        for(int num : nums)
            set.add(num);

        List<Integer> ans = new ArrayList<>();



        for (int i = min; i <= max ; i++) {
            if(!set.contains(i))
                ans.add(i);
        }
        return ans;
    }
}
