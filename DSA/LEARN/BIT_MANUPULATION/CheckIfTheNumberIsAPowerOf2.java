package DSA.LEARN.BIT_MANUPULATION;

public class CheckIfTheNumberIsAPowerOf2 {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(powerOf2(n));
    }

    private static boolean powerOf2(int n){
       if ((n & n - 1) == 0)
           return true;
       else
           return false;
    }
}
