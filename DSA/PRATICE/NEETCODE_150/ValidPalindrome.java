package DSA.PRATICE.NEETCODE_150;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        boolean ans = isPalindrome(s);
        System.out.println(ans);
    }

      public static boolean isPalindrome(String s) {
            int left = 0;
            int right = s.length() - 1;

            s = s.toLowerCase();

            while (left < right){

                while (left < right && !Character.isLetterOrDigit(s.charAt(left))){
                    left++;
                }

                while (left < right && !Character.isLetterOrDigit(s.charAt(right))){
                    right--;
                }

                if (s.charAt(left) != s.charAt(right))
                    return false;

                left++;
                right--;
            }
            return true;
    }
}
