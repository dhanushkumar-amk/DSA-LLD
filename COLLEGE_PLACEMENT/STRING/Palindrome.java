package COLLEGE_PLACEMENT.STRING;

public class Palindrome {
    static void main(String[] args) {
        System.out.println(isPalindrome("aadam"));
    }


    private static boolean isPalindrome(String str){
        int left =0;
        int right = str.length() - 1;


        while(left <= right){
            if (str.charAt(left) != str.charAt(right))
                return false;

            left++;
            right--;
        }
        return true;
    }
}
