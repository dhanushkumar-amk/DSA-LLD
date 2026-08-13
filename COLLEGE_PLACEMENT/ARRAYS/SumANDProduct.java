package COLLEGE_PLACEMENT.ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class SumANDProduct {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        maxOfSumProduct(arr);
        System.out.println(Arrays.toString(arr));
    }


    private static void maxOfSumProduct(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            int sum = 0;

            int temp = arr[i];

            while (temp != 0){
                int remainder = temp % 10;
                product *= remainder;
                sum += remainder;
                temp /= 10;
            }
            arr[i] = Math.max(product, sum);
        }
    }
}
