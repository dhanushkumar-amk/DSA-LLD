package COLLEGE_PLACEMENT.ARRAYS;


import java.util.Arrays;

public class PrintStatement {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

//        System.out.println(Arrays.toString(arr));

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(i < n - 1 ? arr[i] + ", " : arr[i] + " ");
        }
    }
}
