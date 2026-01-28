package DSA.LEARN.SORTING;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
//        selectionSort(arr);
        selectionSort1(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr){
        for (int i = 0; i <= arr.length - 2; i++) {
            int minimumElement = i;
            for (int j = i; j <= arr.length - 1; j++) {
                if (arr[j] < arr[minimumElement])
                    minimumElement = j;
            }
            int temp = arr[minimumElement];
            arr[minimumElement] = arr[i];
            arr[i] = temp;
        }
    }


    private static void selectionSort1(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex);
        }
    }

    private static int getMaxIndex(int[] arr, int startIndex, int lastIndex) {
        int max = startIndex;
        for (int i = startIndex; i <= lastIndex; i++) {
            if (arr[max] < arr[i])
                max = i;
        }
        return max;
    }


    private static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}

