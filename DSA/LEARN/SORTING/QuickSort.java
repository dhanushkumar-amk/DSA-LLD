package DSA.LEARN.SORTING;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        arr = quickSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static int[] quickSort(int[] arr){
        qs(arr, 0, arr.length - 1);
        return arr;
    }

    private static void qs(int[] arr, int low, int high) {
        if (low < high){
            int partitionIndex = partition(arr, low, high);
            qs(arr, low, partitionIndex - 1);
            qs(arr, partitionIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j){
            while (arr[i] <= pivot && i <= high - 1)
                i++;

            while (arr[j] > pivot && j >= low + 1)
                j--;

            if (i < j)
                swap(arr, i, j);
        }
        swap(arr, low, j);
        return j;
    }

    private static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
