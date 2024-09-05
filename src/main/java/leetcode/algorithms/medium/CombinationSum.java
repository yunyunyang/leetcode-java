package leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.List;

// 39. Combination Sum
public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();
        createCombination(candidates, target,0, result, comb, 0);
        return result;
    }

    public void createCombination(int[] candidates, int target, int i, List<List<Integer>> result, List<Integer> comb, int sum) {
        if (sum == target) {
            result.add(new ArrayList<>(comb));
            return;
        }
        if (i >= candidates.length || sum > target) {
            return;
        }
        comb.add(candidates[i]);
        createCombination(candidates, target, i, result, comb, sum + candidates[i]);
        comb.remove(comb.size() - 1);
        createCombination(candidates, target, i + 1, result, comb, sum);
    }
}
