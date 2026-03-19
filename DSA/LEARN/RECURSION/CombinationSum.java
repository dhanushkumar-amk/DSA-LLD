package DSA.LEARN.RECURSION;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,5,7};
        List<List<Integer>>  ans = combinationSum(candidates, 7);

        for (List<Integer> list : ans){
            for (int element : list){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }


     public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        combinationHelper(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    private static void combinationHelper(int index, int[] candidates, int target, List<List<Integer>> ans, ArrayList<Integer> list) {
        if (index == candidates.length) {
            if (target == 0)
                ans.add(new ArrayList<>(list));
            return;
        }

        if (candidates[index] <= target){
            list.add(candidates[index]);
            combinationHelper(index, candidates, target - candidates[index], ans, list);
            list.remove(list.size() - 1);
        }

        combinationHelper(index + 1, candidates, target, ans, list);
    }

}
