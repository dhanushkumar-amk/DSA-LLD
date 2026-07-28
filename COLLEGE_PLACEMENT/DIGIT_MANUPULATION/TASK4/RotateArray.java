package COLLEGE_PLACEMENT.DIGIT_MANUPULATION.TASK4;

import java.util.Arrays;

public class RotateArray {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        rotateArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void rotateArray(int[] arr){
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
    }
}
