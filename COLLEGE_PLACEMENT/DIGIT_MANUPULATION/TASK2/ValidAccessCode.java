package COLLEGE_PLACEMENT.DIGIT_MANUPULATION.TASK2;

import java.util.Scanner;

public class ValidAccessCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();

        // Palindrome Check
        int temp = n;
        int reverse = 0;

        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }

        boolean palindrome = (reverse == n);

        // Neon Check
        int square = n * n;
        int sum = 0;

        if (square == 0)
            sum = 0;
        else {
            while (square > 0) {
                sum += square % 10;
                square /= 10;
            }
        }

        boolean neon = (sum == n);

        if (palindrome && neon)
            System.out.println("Valid Access Code");
        else
            System.out.println("Invalid Access Code");

    }
}