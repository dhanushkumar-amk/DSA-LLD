package DSA.LEARN.MATHS;

public class CountDigit {
    public static void main(String[] args) {
        int ans = count(561234);
        int digit = countUsingLog10(123456);

        System.out.println(ans);
        System.out.println(digit);
    }

    // using digit extraction
    public static int count(int n){
        int count = 0;
        while (n > 0){
            count++;
            n = n / 10;
        }
        return count;
    }

    // using log10
    public static int countUsingLog10(int n){
        int ans = (int) Math.log10(n)  + 1;
        return ans;
    }
}
