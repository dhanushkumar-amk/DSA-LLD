package COLLEGE_PLACEMENT.DIGIT_MANUPULATION.TASK2;

import java.util.Scanner;

public class VerificationValue2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        int firstDigit = 0;
        int lastDigit = n % 10;

        int num = n;
        while(num >= 0){
            num = num / 10;
        }
        firstDigit = num;

        int temp  = n;

        int evenCount = 0;
        int oddCount = 0;

        while (temp > 0){
            int remainder = num % 10;

            if (remainder % 2 == 0)
                evenCount++;
            else
                oddCount++;

            temp /= 10;
        }

        int verificationValue = (evenCount * oddCount) + (lastDigit * firstDigit);

        System.out.println(verificationValue);

    }
}
