package COLLEGE_PLACEMENT.DIGIT_MANUPULATION.TASK2;

import java.util.Scanner;

public class ReplaceZeroWithFiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt(); //n=106070

        if (n == 0) {
            System.out.println(5);
            return;
        }

        int result = 0;
        int place = 1;

        while (n > 0) {
            int lastDigit = n % 10;

            if (lastDigit == 0)
                lastDigit = 5;

            result = lastDigit * place + result;

            place *= 10;
            n /= 10;
        }

        System.out.println(result);

    }
}