package DSA.LEARN.STACK_AND_QUEUE;

import java.util.*;

public class AstroidCollision {
    public static void main(String[] args) {
        int[] arr = {4,7,1,1,2,-3,-7,17,15,-16};
        System.out.println(Arrays.toString(asteroidCollision(arr)));
    }

    public static int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st = new Stack<>();

        for (int a : asteroids) {

            while (!st.isEmpty() && st.peek() > 0 && a < 0) {

                if (st.peek() < -a) {
                    st.pop();
                }
                else if (st.peek() == -a) {
                    st.pop();
                    a = 0;
                }
                else {
                    a = 0;
                }
            }

            if (a != 0) {
                st.push(a);
            }
        }

        int[] res = new int[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }

        return res;
    }
}