package DSA.LEARN.BIT_MANUPULATION;

public class CountNumberOfSetBits {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(  countSetBit(n));
    }

    private static int countSetBit(int n){
        int count = 0;

        while (n > 0){
            if ((n & 1) == 1)
                count++;
            n = n / 2;
        }
        return count;
    }
}
