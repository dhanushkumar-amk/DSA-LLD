package COLLEGE_PLACEMENT.ARRAYS;

public class Intro {
    static void main(String[] args) {
        int[] arr  = {1,2,3,4,5,6,7};

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }

        for (int i = arr.length - 1;  i >= 0 ; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
