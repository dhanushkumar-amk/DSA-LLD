package COLLEGE_PLACEMENT.ARRAYS;

import java.util.*;

public class UserInput {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
    }
}
