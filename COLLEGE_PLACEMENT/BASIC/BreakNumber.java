package COLLEGE_PLACEMENT.BASIC;

import java.util.Scanner;

public class BreakNumber {
    static void main() {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scanner.nextInt();

        while (n > 0){
            int remainder = n % 10;
            System.out.println(remainder);
            n = n / 10;
        }
    }
}
