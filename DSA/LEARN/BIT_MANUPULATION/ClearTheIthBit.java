package DSA.LEARN.BIT_MANUPULATION;

public class ClearTheIthBit {
    public static void main(String[] args) {
        int n = 13;
        int k = 2;
        System.out.println(clearIthBit(n, k));
    }

    private static int clearIthBit(int n, int k){
        int mask = ~(1 << k);
        return n & mask;
    }
}
