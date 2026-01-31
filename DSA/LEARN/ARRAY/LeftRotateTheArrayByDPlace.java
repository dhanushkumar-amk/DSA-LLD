package DSA.LEARN.ARRAY;

import java.util.Arrays;

public class LeftRotateTheArrayByDPlace {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int d = 2;
        rotate(arr, d);
        System.out.println(Arrays.toString(arr));
    }

    private static void rotate(int[] arr, int d){
        int n = arr.length;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    private static void reverse(int[] arr, int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
