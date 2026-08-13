package COLLEGE_PLACEMENT.ARRAYS.TWO_POINTERS;

import java.util.Arrays;

public class ReverseEvenNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5,2,4,5,6,7,8,9,10, 24};
        System.out.println(Arrays.toString(arr));

        int[] ans = reverse(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
//
//            while (arr[left] % 2 != 0)
//                left++;
//
//
//            while (arr[right] % 2 != 0)
//                right--;


            if(arr[left] % 2 != 0)
                left++;
            else if (arr[right] % 2 != 0)
                right--;
            else{
                arr[left] = arr[left] ^ arr[right];
                arr[right] = arr[left] ^ arr[right];
                arr[left] = arr[left] ^ arr[right];
                left++;
                right--;
            }
        }
        return arr;
    }
}
