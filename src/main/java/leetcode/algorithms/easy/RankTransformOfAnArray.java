package leetcode.algorithms.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 1331. Rank Transform of an Array
public class RankTransformOfAnArray {

    public int[] arrayRankTransform(int[] arr) {
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);

        Map<Integer, Integer> rank = new HashMap<>();
        int index = 1;
        for (Integer i : sortedArr) {
            if (!rank.containsKey(i)) {
                rank.put(i, index);
                index ++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rank.get(arr[i]);
        }
        return arr;
    }
}
