package DSA.CODING_NINJA;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if(j == 1 || j == i)
                    System.out.print(1 + " ");
                else
                    System.out.print(2 + " ");
            }
            System.out.println();
        }
    }
}