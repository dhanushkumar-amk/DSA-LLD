package COLLEGE_PLACEMENT.DIGIT_MANUPULATION.TASK4;

import java.util.Arrays;

public class FindFirstAndLastPositionInSortedArray {
    static void main(String[] args) {
        int[] arr = {1,2,2,2,3,4,5,6,7,8};

        int[] ans = firstAndLast(arr, 2);

        System.out.println(Arrays.toString(ans));
    }


    private static int[] firstAndLast(int[] arr, int target) {
        int first = -1;
        int last = -1;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        return new int[]{first, last};
    }
}
