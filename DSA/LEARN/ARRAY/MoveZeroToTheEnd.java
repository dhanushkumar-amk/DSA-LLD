package DSA.LEARN.ARRAY;

import java.util.Arrays;

public class MoveZeroToTheEnd {
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,3,0,4,0,5,0};
        move(arr);
        System.out.println(Arrays.toString(arr));
    }

    // bruteforce
    private static void movesZero(int[] arr){
        int[] ans = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                ans[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(ans));
    }

    // optimal
    private static void move(int[] arr){

        // step 1 => find the first zero element
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                j = i;
                break;
            }
        }

        // step 2 swap with the non zero number with j
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0){
                swap(arr, i, j);
                j++;
            }
        }
    }

    private static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
