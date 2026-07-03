package DSA.LEETCODE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortIntegersByTheNumberOf1Bits {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        int[] ans = sortByBits(arr);
        System.out.println(Arrays.toString(ans));
    }


    // use inbuild method
    public static int[] sortByBits(int[] arr) {
        int n = arr.length;

        List<int[]> list = new ArrayList<>();

        for (int i : arr) {
            int count = Integer.bitCount(i);
            list.add(new int[]{i, count});
        }
        Collections.sort(list, (a, b) -> a[1] != b[1] ? a[1] - b[1] : a[0] - b[0]);
        int[] res = new int[n];

        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i)[0];
        }
        return res;
    }


    // use own method
    private static int[] sortByBits2(int[] arr){
        int n = arr.length;

        List<int[]> list = new ArrayList<>();

        for (int i : arr) {
            int count = countSetBites(i);
            list.add(new int[]{i, count});
        }
        list.sort((a, b) -> a[1] != b[1] ? a[1] - b[1] : a[0] - b[0]);
        int[] res = new int[n];

        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i)[0];
        }
        return res;
    }

//    brian kernighan algorithm
    private static int countSetBites(int element){
        int count = 0;

        while (element > 0) {
            element = element & (element - 1);
            count++;
        }
        return count;
    }

}
