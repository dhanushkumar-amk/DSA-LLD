package COLLEGE_PLACEMENT.ARRAYS.TWO_POINTERS;

public class Palindrome {
    static void main(String[] args) {
        int[] arr = {1,2,3,1,1};

    isPalindrome2(arr);

//    boolean ans = isPalindrome(arr);
//        if (ans)
//            System.out.println("Is palindrome");
//        else
//            System.out.println("Not palindrome");

    }

    public static boolean isPalindrome(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        while (left < right){
            if (arr[left] != arr[right])
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void isPalindrome2(int[] arr){

    int left = 0;
    int right = arr.length - 1;

    boolean isPalindrome = true;

    while (left < right) {
        if (arr[left] != arr[right]) {
            isPalindrome = false;
            break;
        }
        left++;
        right--;
    }

    if (isPalindrome) {
        System.out.println("Is a palindrome");
    } else {
        System.out.println("Is not a palindrome");
    }
    }
}
