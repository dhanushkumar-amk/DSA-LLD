package DSA.LEETCODE;

public class FindThePivotInteger {


    // bruteforce
     public static int pivotInteger1(int n) {

         for (int i = 1; i <= n; i++) {
             int leftSum = 0;
             int rightSum = 0;

             for (int j = 1; j <= i; j++)
                 leftSum += j;

             for (int j = i; j <= n; j++)
                 rightSum += j;

             if(leftSum == rightSum)
                 return i;
         }
         return -1;
    }


    public int pivotInteger(int n) {
       int sum = ( n * (n + 1) / 2);
       int squareRoot = (int) Math.sqrt(sum);


       return squareRoot * squareRoot == sum ? squareRoot : -1;
    }

}
