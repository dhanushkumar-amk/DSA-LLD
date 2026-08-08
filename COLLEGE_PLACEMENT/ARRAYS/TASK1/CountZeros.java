package COLLEGE_PLACEMENT.ARRAYS.TASK1;

import java.util.Scanner;

public class CountZeros {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        int zeroCount = 0;

        for(int i = 0; i < arr.length; i++){
            if (arr[i] == 0)
                zeroCount++;
        }


        System.out.println(zeroCount);
    }
}
