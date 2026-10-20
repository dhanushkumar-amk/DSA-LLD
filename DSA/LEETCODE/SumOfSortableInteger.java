package DSA.LEETCODE;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class SumOfSortableInteger {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int[] drops = IntStream.range(0, n - 1).filter(j -> nums[j] > nums[j + 1]).toArray();  // j with nums[j] > nums[j + 1]

        IntPredicate sortable = k -> {  // each drop needs its own block, which must wrap into order and fit between its neighbors
            if (drops.length > n / k) return false;  // a block holds at most one drop
            int prevBlock = -1, prevDrop = -1;
            for (int j : drops) {
                int block = j / k, offset = j % k;
                int start = j - offset, end = start + k - 1;
                if (offset == k - 1  // the drop sits on a border
                        || block == prevBlock  // a second drop in the same block
                        || nums[end] > nums[start]  // the block can't wrap into order
                        || start > 0 && (prevBlock == block - 1 ? nums[prevDrop] : nums[start - 1]) > nums[j + 1]  // left block's max > this block's min
                        || end + 1 < n && nums[j] > nums[end + 1])  // this block's max > the next value
                    return false;
                prevBlock = block;
                prevDrop = j;
            }
            return false;
        };
        return 0;
    }
}
