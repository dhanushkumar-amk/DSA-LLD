package DSA.LEARN.STACK_AND_QUEUE;

import java.util.ArrayList;
import java.util.Stack;

public class NextPreviousElement {
    public static void main(String[] args) {
        int[] arr = {1, 5, 0, 3, 4, 5};
        ArrayList<Integer> ans = prevSmaller(arr);
        for(int element : ans)
            System.out.print(element + " ");
    }


     public static ArrayList<Integer> prevSmaller(int[] arr) {
       int n = arr.length;
         Stack<Integer> monotonicStack = new Stack<>();
         ArrayList<Integer> ans = new ArrayList<>();

         for (int i = 0; i < n; i++) {

             while (!monotonicStack.isEmpty() && monotonicStack.peek() >= arr[i]){
                 monotonicStack.pop();
             }

             if (monotonicStack.isEmpty()){
                 ans.add(-1);
             }else{
                 ans.add(monotonicStack.peek());
             }

             monotonicStack.push(arr[i]);
         }
        return ans;
    }
}
