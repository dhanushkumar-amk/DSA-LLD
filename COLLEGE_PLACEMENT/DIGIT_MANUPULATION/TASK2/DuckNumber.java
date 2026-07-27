package COLLEGE_PLACEMENT.DIGIT_MANUPULATION.TASK2;

import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           System.out.println("Enter the value of n : ");
        int n = sc.nextInt();

        int temp = n;
        boolean duck = false;

        while (temp > 0) {
            if (temp % 10 == 0) {
                duck = true;
                break;
            }
            temp /= 10;
        }

        if (duck)
            System.out.println("Duck Number");
        else
            System.out.println("Not a Duck Number");

    }
}