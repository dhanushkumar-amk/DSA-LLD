package COLLEGE_PLACEMENT.ARRAYS.TWO_POINTERS;

import java.util.Arrays;

public class ReverseArrayByKGroup {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int k = 3;
        reverseKGroup(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    private static void  reverseKGroup(int[] arr, int k){
        for (int i = 0; i < arr.length; i+= k) {
            int start = i;
            int end = Math.min(i + k - 1,  arr.length - 1);
            while (start < end){
                swap(arr, start, end);
                start++;
                end--;
            }
        }
    }

     private static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
