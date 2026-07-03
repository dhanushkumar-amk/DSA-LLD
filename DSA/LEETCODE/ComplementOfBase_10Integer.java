package DSA.LEETCODE;

public class ComplementOfBase_10Integer {
    public static void main(String[] args) {
            int ans = bitwiseComplement1(5);
        System.out.println(ans);
    }


    // approuch 1
    public static int bitwiseComplement1(int n) {
        String s = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            if (c == '1')
                sb.append('0');
            else
                sb.append('1');
        }

        return Integer.parseInt(sb.toString(), 2);
    }
}
