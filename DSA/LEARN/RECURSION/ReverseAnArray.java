package DSA.LEARN.RECURSION;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int n = arr.length;

        reverse(0, arr, n);

        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int i, int[] arr, int n) {
        if (i >= n / 2) {
            return;
        }
        swap(arr, i, n - i - 1);
        reverse(i + 1, arr, n);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
