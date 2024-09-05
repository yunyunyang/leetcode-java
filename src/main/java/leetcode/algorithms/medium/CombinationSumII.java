package leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();
        createComb(candidates, target, output, comb, 0, 0);
        return output;
    }

    private void createComb(int[] candidates, int target, List<List<Integer>> output, List<Integer> comb, int i, int total) {
        if (total == target) {
            output.add(new ArrayList<>(comb));
            return;
        }

        if (i >= candidates.length || total > target) {
            return;
        }

        comb.add(candidates[i]);
        createComb(candidates, target, output, comb, i + 1, total + candidates[i]);
        comb.remove(comb.size() - 1);

        while (i + 1 < candidates.length && candidates[i] == candidates[i + 1]) {
            i ++;
        }
        createComb(candidates, target, output, comb, i + 1, total);
    }
}
