package DSA.LEARN.STACK_AND_QUEUE;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {6, 0, 8, 1, 3};
        int[] ans = greaterElement(arr);
        System.out.println(Arrays.toString(ans));
    }


    // bruteforce
    public static int[] greater(int[] arr) {
        int[] ans = new int[arr.length];

        Arrays.fill(ans, -1);

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    ans[i] = arr[j];
                    break;
                }
            }
        }
        return ans;
    }



    // optimal approach
    public static int[] greaterElement(int[] arr){

        int[] ans = new int[arr.length];
        Stack<Integer> monotonicStack = new Stack<>();

        for (int i = arr.length - 1;  i >= 0 ; i--) {
            while (!monotonicStack.isEmpty() && monotonicStack.peek() <= arr[i]){
                monotonicStack.pop();
            }

            if (monotonicStack.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = monotonicStack.peek();
            }

            monotonicStack.push(arr[i]);

        }
        return ans;
    }

}