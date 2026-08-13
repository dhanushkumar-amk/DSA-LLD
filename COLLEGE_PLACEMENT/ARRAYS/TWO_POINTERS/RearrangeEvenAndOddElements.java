package COLLEGE_PLACEMENT.ARRAYS.TWO_POINTERS;

import java.util.Arrays;

public class RearrangeEvenAndOddElements {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));

        seperate(arr);
        System.out.println(Arrays.toString(arr));
    }


    private static void seperate(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        while (left < right){
            if (arr[left] % 2 == 0)
                left++;
            else if (arr[right] % 2 != 0)
                right--;
            else {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
    }

        private static void swap(int[] arr, int first, int last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
    }
}
