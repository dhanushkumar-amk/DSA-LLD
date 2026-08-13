package COLLEGE_PLACEMENT.ARRAYS.TWO_POINTERS;

import java.util.Arrays;

public class ReverseNumberWithOutTemp {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        System.out.println(Arrays.toString(arr));

        int[] ans = reverse(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] reverse(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        while (left < right){
            arr[left] = arr[left] ^ arr[right];
            arr[right] = arr[left] ^ arr[right];
            arr[left] = arr[left] ^ arr[right];

            left++;
            right--;
        }
        return arr;
    }
}
