package COLLEGE_PLACEMENT.ARRAYS;

import java.util.Scanner;

public class LargestNumber {
    static void main(String[] args) {

        int[] arr = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int index = 0; index < arr.length; index++) {
            arr[index] = scanner.nextInt();
        }


        largest(arr);
        smallest(arr);
        oddEvenCount(arr);
    }


    public static void largest(int[] arr){
        int max = Integer.MIN_VALUE;

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] > max)
                max  = arr[index];
            else
                continue;
        }

        System.out.println(max);
    }


    public static void smallest(int[] arr){
        int min = Integer.MAX_VALUE;

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] < min)
                min = arr[index];
            else
                continue;
        }

        System.out.println(min);
    }


     public static void oddEvenCount(int[] arr){

        int oddCount = 0;
        int evenCount = 0;

         for (int index = 0; index < arr.length; index++) {
             if (arr[index] % 2 == 0)
                 evenCount++;
             else
                 oddCount++;
         }

        System.out.println(oddCount);
         System.out.println(evenCount);
    }


    private static void sum(int[] arr){
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum =+ arr[index];
        }

        System.out.println(sum);
    }

}
