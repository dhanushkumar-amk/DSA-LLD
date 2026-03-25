package DSA.LEARN.STACK_AND_QUEUE;

import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // push opening brackets
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {

                // if stack empty → invalid
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                // check matching
                if ((ch == ')' && top == '(') ||
                    (ch == ']' && top == '[') ||
                    (ch == '}' && top == '{')) {
                    continue;
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}