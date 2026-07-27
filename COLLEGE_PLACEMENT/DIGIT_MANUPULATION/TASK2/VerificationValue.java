package COLLEGE_PLACEMENT.DIGIT_MANUPULATION.TASK2;

import java.util.Scanner;

public class VerificationValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");

        int n = sc.nextInt();

        int lastDigit = n % 10;
        int temp = n;

        int evenCount = 0;
        int oddCount = 0;

        while (temp > 0) {
            int digit = temp % 10;

            if (digit % 2 == 0)
                evenCount++;
            else
                oddCount++;

            temp /= 10;
        }

        temp = n;
        while (temp >= 10) {
            temp /= 10;
        }
        int firstDigit = temp;

        int verificationValue = (firstDigit * lastDigit) + (evenCount * oddCount);

        System.out.println(verificationValue);

    }
}