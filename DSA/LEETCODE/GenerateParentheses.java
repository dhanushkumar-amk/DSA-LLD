package DSA.LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    static void main(String[] args) {

    }

    public  List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(ans, new StringBuilder(), 0, 0, n);
        return  ans;
    }


    public void  backtrack(List<String> ans, StringBuilder current, int openingCount, int closingCount, int max){
        if(current.length() == max * 2){
            ans.add(current.toString());
            return;
        }

        if (openingCount < max){
            current.append("(");
            backtrack(ans, current, openingCount + 1, closingCount, max);
            current.deleteCharAt(current.length() - 1);
        }

        if (openingCount > closingCount){
            current.append(")");
             backtrack(ans, current, openingCount, closingCount + 1, max);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
