package DSA.LEARN.BIT_MANUPULATION;

public class DecimalToBinary {

    public static void main(String[] args) {
        String ans = decimalToBinary(5);
        System.out.println(ans);
    }

    public static String decimalToBinary(int n) {

        if (n == 0) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            int remainder = n % 2;
            sb.append(remainder);
            n = n / 2;
        }

        sb.reverse();
        return sb.toString();
    }
}