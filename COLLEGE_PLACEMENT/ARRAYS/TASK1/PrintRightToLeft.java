package COLLEGE_PLACEMENT.ARRAYS.TASK1;

import java.util.Scanner;

public class PrintRightToLeft {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        for (int i = arr.length - 1; i >= 0 ; i--) {
            System.out.println(arr[i] + " ");
        }
    }
}


/** Print the array from right to left
Count Even and Odd Numbers
Sum of Array Elements
Average of Array Elements
Count Zeros in an Array
Find Frequency of an Element
Find Largest Element in an Array
Find Smallest Element in an Array */