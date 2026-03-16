package DSA.LEARN.BIT_MANUPULATION;

public class Check_If_Ith_BitIsSetOrNot {
    public static void main(String[] args) {
        int n = 13;
        int k = 2;

        System.out.println(isSetORNot(n, k));
    }

    private static boolean isSetORNot(int n, int k){
        int mask = 1 << k;
        if ((n & mask) != 0)
            return true;
        else
            return false;
    }
}
