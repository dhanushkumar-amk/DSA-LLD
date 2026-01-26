package DSA.LEARN.MATHS;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = method3(a,b);
        System.out.println(ans);
    }

    // bruteforce
    public static int method1(int a, int b){
        int min = Math.min(a, b);
        for (int i = min; i >= 1 ; --i) {
            if (a % i == 0 && b % i == 0)
                return i;
        }
        return 1;
    }

    // Euclidean algorithm
    public static int method2(int a, int b){
         while (a != b){
             if (a > b)
                 a = a - b;
             else
                 b = b - a;
         }
     return a;
    }

    // Optimized Euclidean algorithm
    public static int method3(int a, int b){
        while (a != 0 && b != 0){
            if (a > b)
                a = a % b;
            else
                b = b % a;
        }
        return Math.max(a, b);
    }

}
