package DSA.LEARN.ARRAY;

import java.util.Arrays;

public class MergeTwoSortedArrayWithOutExtraSpace {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {0,2,6,8,9};

        merge1(arr1, arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

//    solution 1
    private static void merge1(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;

        int left = n - 1;
        int right = 0;

        while (left >= 0 && right < m){
            if (arr1[left] > arr2[right]){
                swap(arr1, arr2, left, right);
                left--;
                right++;
            }
            else {
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    private static void swap(int[] arr1, int[] arr2, int right, int left){
        int temp = arr1[left];
        arr1[left] = arr2[right];
        arr2[right] = temp;
    }
}
