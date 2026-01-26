package DSA.LEARN.MATHS;

import java.util.ArrayList;
import java.util.Collections;


public class PrintAllDivisors {
    public static void main(String[] args) {
//        printDivisors(36);
//        optimalValue(36);
        printWithOptimalAndSorted(36);
    }

    public static void printDivisors(int n){
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }
    }

    public static void optimalValue(int n){
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i == n / i)
                   continue;
                else
                    System.out.println(n / i + " ");
            }
        }
    }

    public static void printWithOptimalAndSorted(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
               list.add(i);
                if (i == n / i)
                    continue;
                else
                    list.add(n / i);
            }
        }
        Collections.sort(list);
        for(int e : list)
            System.out.print(e + " ");
    }
}
