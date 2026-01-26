package DSA.LEARN.MATHS;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(prime1(n));
    }

    public static boolean prime1(int n){
        int count = 0;

        for (int i = 1; i * i <= n ; i++) {
            if (n % i == 0){
                count++;
                if (n / i != i)
                    count++;
            }
        }
        if (count == 2)
            return true;
        else return false;
    }
}
