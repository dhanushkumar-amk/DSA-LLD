package DSA.PRATICE.NEETCODE_150;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

        System.out.println(isValid("()"));       // true
        System.out.println(isValid("()[]{}"));   // true
        System.out.println(isValid("(]"));       // false
        System.out.println(isValid("([)]"));     // false
        System.out.println(isValid("{[]}"));     // true
    }

    // Approach 1 - Fails because it doesn't check order
    public static boolean isValid1(String s) {
        int circleBracket = 0;
        int flowerBracket = 0;
        int squareBracket = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[')
                squareBracket++;
            else if (s.charAt(i) == '{')
                flowerBracket++;
            else if (s.charAt(i) == '(')
                circleBracket++;
            else if (s.charAt(i) == ']')
                squareBracket--;
            else if (s.charAt(i) == '}')
                flowerBracket--;
            else
                circleBracket--;
        }

        return squareBracket == 0 &&
               circleBracket == 0 &&
               flowerBracket == 0;
    }

    // Optimal Approach - Stack
    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char currentElement = s.charAt(i);

            if (currentElement == '[' ||
                currentElement == '{' ||
                currentElement == '(') {

                stack.push(currentElement);

            } else {

                if (stack.isEmpty()) {
                    return false;
                }

                char topElement = stack.pop();

                if ((currentElement == ']' && topElement != '[') ||
                    (currentElement == '}' && topElement != '{') ||
                    (currentElement == ')' && topElement != '(')) {

                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}