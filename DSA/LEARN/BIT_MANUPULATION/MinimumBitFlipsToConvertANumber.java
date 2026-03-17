package DSA.LEARN.BIT_MANUPULATION;

public class MinimumBitFlipsToConvertANumber {
    public static void main(String[] args) {
        int start = 12;
        int goal = 7;
        System.out.println(countMinimumFlips(start, goal));
    }

    private static int countMinimumFlips(int start, int goal){
            int ans = start ^ goal;
            int count = 0;
            while (ans > 0){
                ans = ans & ans - 1;
                count++;
            }
            return count;
    }
}
