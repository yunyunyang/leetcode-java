package leetcode.algorithms.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 1200. Minimum Absolute Difference
public class MinimumAbsoluteDifference {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            minDiff = Math.min(minDiff, Math.abs(arr[i] - arr[i - 1]));
        }

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 1;i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == minDiff) {
                res.add(new ArrayList<>(Arrays.asList(arr[i - 1], arr[i])));
            }
        }
        return res;
    }
}
