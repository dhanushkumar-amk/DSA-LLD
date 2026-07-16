package COLLEGE_PLACEMENT.DIGIT_MANUPULATION;

import java.util.Scanner;

public class BreakNumber {
    static void main() {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scanner.nextInt();

        printReverse(n);

        System.out.println();

        System.out.println(reverseNumber(n));
        System.out.println(sum(n));

        System.out.println(countDigit(n));
    }


    // reverse a number
    public static int reverseNumber(int n){
      int sum = 0;
        while (n > 0){
            int remainder = n % 10;
            sum = sum * 10 + remainder;
            n = n / 10;
        }
        return sum;
    }


    // print the reverse number
    public static void printReverse(int n){
           while (n > 0){
            int remainder = n % 10;
            System.out.print(remainder);
            n = n / 10;
        }
    }

    // sum of the digits
     public static int sum(int n){
        int sum = 0;
        while (n > 0){
            int remainer = n % 10;;
            sum += remainer;
            n /= 10;
        }
        return sum;
    }

    // count no of digits
    public static int countDigit(int n){
        int count = 0;
        while (n > 0){
            int remainder = n % 10;
            n /= 10;
            count++;
        }
        return count;
    }
}
