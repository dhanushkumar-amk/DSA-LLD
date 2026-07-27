package COLLEGE_PLACEMENT.DIGIT_MANUPULATION.TASK2;

import java.util.Scanner;

public class SecurePIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the PIN : ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;

        while (temp > 0) {
            int remainder = temp % 10;
            sum += remainder;
            temp /= 10;
        }

        int lastTwoDigits = n % 100;
        if (sum == lastTwoDigits)
            System.out.println("Secure PIN");
        else
            System.out.println("Not Secure PIN");
    }
}

//9014 - secure pin