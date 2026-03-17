package DSA.LEARN.BIT_MANUPULATION;

public class RemoveTheLastSetBit {
    public static void main(String[] args) {
        int n = 76;
        System.out.println(removeSetBitRightMost(n));
    }

    private static int removeSetBitRightMost(int n){
        return (n & (n - 1));
    }
}
