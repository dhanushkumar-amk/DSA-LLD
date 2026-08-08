package COLLEGE_PLACEMENT.ARRAYS.TASK1;

import java.util.Scanner;

public class EvenOddCount {

    static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        System.out.println(evenCount);
        System.out.println(oddCount);
    }
}
