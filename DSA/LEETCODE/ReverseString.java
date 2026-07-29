package DSA.LEETCODE;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(5 + "5"  + 5);
    }

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left <= right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}