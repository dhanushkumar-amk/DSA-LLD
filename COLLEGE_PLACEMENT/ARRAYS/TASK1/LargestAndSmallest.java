package COLLEGE_PLACEMENT.ARRAYS.TASK1;

import java.util.Arrays;
import java.util.Scanner;

public class LargestAndSmallest {
    static void main(String[] args) {


         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        System.out.println(min);
        System.out.println(max);

    }
}
