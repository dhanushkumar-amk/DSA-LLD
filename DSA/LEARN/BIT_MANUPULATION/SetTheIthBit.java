package DSA.LEARN.BIT_MANUPULATION;

public class SetTheIthBit {
    public static void main(String[] args) {
       int n = 9;
       int k = 3;

       int ans = setIthBit(n, k);
        System.out.println(ans);
    }

    private static int setIthBit(int n, int k){
        int mask = 1 <<(k - 1);
        return n | mask;
    }
}
