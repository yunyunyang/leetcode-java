package leetcode.algorithms.medium;

import java.util.LinkedList;
import java.util.List;

// 216. Combination Sum III
public class CombinationSumIII {

    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> track = new LinkedList<>();
    int trackSum = 0;

    public List<List<Integer>> combinationSum3(int k, int n) {
        backtrack(k, n, 1);
        return res;
    }

    void backtrack(int k, int n, int start) {
        if (trackSum == n && track.size() == k) {
            res.add(new LinkedList<>(track));
            return;
        }

        if (trackSum > n)
            return;

        for (int i = start; i <= 9; i++) {
            track.add(i);
            trackSum += i;

            backtrack(k, n, i + 1);

            track.removeLast();
            trackSum -= i;
        }
    }
}
