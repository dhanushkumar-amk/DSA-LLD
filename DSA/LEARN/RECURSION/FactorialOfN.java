package DSA.LEARN.RECURSION;

public class FactorialOfN {
    public static void main(String[] args) {
        System.out.println(fact(5));
        fact2(5, 1);
    }

    // functional recursion
    private static int fact(int n){
        if (n == 1)
            return 1;
        return n * fact(n - 1);
    }

    // parameterized recursion
    private static void fact2(int i, int n){
        if(i == 1){
            System.out.println(n);
            return;
        }
        fact2(i - 1, n  * i);


    }
}
