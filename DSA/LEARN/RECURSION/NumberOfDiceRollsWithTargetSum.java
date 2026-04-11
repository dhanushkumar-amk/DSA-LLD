package DSA.LEARN.RECURSION;

public class NumberOfDiceRollsWithTargetSum {
    public static void main(String[] args) {
        System.out.println( possibleMoves("", 4, 0));
    }

    private static void possibleMoves(String processed, int target){
        if (target == 0){
            System.out.println(processed);
            return;
        }
        for (int i = 1; i <= 6 ; i++) {
            if (target - i >= 0)
                possibleMoves(processed + i, target - i);
        }
    }


     private static int possibleMoves(String processed, int target, int count){
        if (target == 0){
            return count + 1;
        }
        for (int i = 1; i <= 6 && i <= target ; i++) {
               count =  possibleMoves(processed + i, target - i, count);
        }
        return count;
    }
}
