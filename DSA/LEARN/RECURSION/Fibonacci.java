package DSA.LEARN.RECURSION;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }

    private static int fibo(int n){
        if (n <= 1)
            return n;

        int last = fibo(n - 1);
        int secondLast = fibo(n - 2);

        return last + secondLast;
    }
}
