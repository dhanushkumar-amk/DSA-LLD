package COLLEGE_PLACEMENT.ARRAYS.TWO_POINTERS;

import java.util.Arrays;

public class MoveZeroToEndOfAnArray {
    static void main(String[] args) {
        int[] arr = {1,0,0,0,1,3,5,7};

        moveZero1(arr);
        System.out.println(Arrays.toString(arr));
    }

    // brute force time = O(n) and space = O(n)
     private static void movesZero(int[] arr){

        int[] ans = new int[arr.length];
        // default value is zero

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                ans[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(ans));
    }


    // better(optimal) time = O(n) and space = O(1)
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



    // optimal time = O(n) and space = O(1)
    private static void moveZeroToTheEnd(int[] arr){
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] != 0){
                // edge case
                    if (i != j){
                        swap(arr, i, j);
                    }
                j++;
            }
        }
    }


    private static void moveZero1(int[] arr){
        int zero = 0;
        int nonZero = 0;

        while (nonZero < arr.length){
            if (arr[nonZero] != 0){
                swap(arr, zero, nonZero);
                zero++;
                nonZero++;
            } else if (arr[nonZero] == 0) {
                nonZero++;
            }
        }
    }


     private static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

}
