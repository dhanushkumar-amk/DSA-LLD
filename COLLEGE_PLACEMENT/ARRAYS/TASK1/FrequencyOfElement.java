package COLLEGE_PLACEMENT.ARRAYS.TASK1;

import java.util.Scanner;

public class FrequencyOfElement {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        int[] frequency = new int[10];

        for (int i = 0; i < arr.length; i++) {
            frequency[arr[i]]++;
        }

        for (int i = 0; i < frequency.length; i++) {
            System.out.println(i + " " + frequency[i]);
        }

    }
}
