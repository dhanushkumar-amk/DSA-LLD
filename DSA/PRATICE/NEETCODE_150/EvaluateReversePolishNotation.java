package DSA.PRATICE.NEETCODE_150;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    public static void main(String[] args) {

        String[] tokens1 = {"2", "1", "+", "3", "*"};
        System.out.println(evalRPN(tokens1)); // 9

        String[] tokens2 = {"4", "13", "5", "/", "+"};
        System.out.println(evalRPN(tokens2)); // 6

        String[] tokens3 = {
                "10", "6", "9", "3", "+", "-11",
                "*", "/", "*", "17", "+", "5", "+"
        };
        System.out.println(evalRPN(tokens3)); // 22
    }

    public static int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {

            if (isOperator(token)) {

                int second = stack.pop();
                int first = stack.pop();

                int result = applyOperator(token, first, second);
                stack.push(result);

            } else {

                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    private static boolean isOperator(String token) {
        return token.equals("+")
                || token.equals("-")
                || token.equals("*")
                || token.equals("/");
    }

    private static int applyOperator(String operator, int first, int second) {

        switch (operator) {

            case "+":
                return first + second;

            case "-":
                return first - second;

            case "*":
                return first * second;

            case "/":
                return first / second;

            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
}