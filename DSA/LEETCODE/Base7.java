package DSA.LEETCODE;

public class Base7 {
    static void main(String[] args) {

    }


    public String convertToBase7(int num) {
        int sum = 0;
        StringBuilder ans = new StringBuilder();

        if (num == 0)
            return "0";

        boolean isNegative  = (num < 0);

        num = Math.abs(num);

        while (num > 0){
            int remainder = num % 7;
            ans.append(remainder);
            num = num / 7;
        }

        ans.reverse();

         if (isNegative) {
            ans.insert(0, '-');
        }

        return ans.toString();
    }
}
