package DSA.LEETCODE;

public class SumMultiples {


     public int sumOfMultiples(int n) {
        int sum = 0;

         for (int i = 1; i <= n; i++) {
             if (n % 3 == 0 || n % 5 == 0 || n % 7 == 0)
                 sum += i;
         }
         return sum;
    }
}
