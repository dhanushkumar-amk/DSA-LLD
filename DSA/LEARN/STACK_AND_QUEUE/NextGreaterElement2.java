package DSA.LEARN.STACK_AND_QUEUE;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement2 {
    public static void main(String[] args) {
         int[] arr = {2,10,12,1,11};
        int[] ans = greaterElement(arr);
        System.out.println(Arrays.toString(ans));
    }



     // optimal approach
    public static int[] greaterElement(int[] arr){

        int[] ans = new int[arr.length];
        Stack<Integer> monotonicStack = new Stack<>();
        int n = arr.length;

        for (int i = n * 2 - 1;  i >= 0 ; i--) {
            while (!monotonicStack.isEmpty() && monotonicStack.peek() <= arr[i % n]){
                monotonicStack.pop();
            }

          if (i < n)
              ans[i] = monotonicStack.isEmpty() ? -1 : monotonicStack.peek();

            monotonicStack.push(arr[i % n]);

        }
        return ans;
    }
}
