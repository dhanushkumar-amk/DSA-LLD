package DSA.LEARN.SORTING;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 31, 2, 1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swap = true;
                }
            }
            if (!swap)
                break;
        }
    }

    private static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
