package leetcode.algorithms.easy;

import java.util.Map;
import java.util.TreeMap;

// 2570. Merge Two 2D Arrays by Summing Values
public class MergeTwo2DArraysBySummingValues {

    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> counter = new TreeMap<>();
        for (int i = 0; i < nums1.length; i++) {
            counter.put(nums1[i][0], counter.getOrDefault(nums1[i][0], 0) + nums1[i][1]);
        }
        for (int i = 0; i < nums2.length; i++) {
            counter.put(nums2[i][0], counter.getOrDefault(nums2[i][0], 0) + nums2[i][1]);
        }

        int[][] res = new int[counter.size()][2];
        int i = 0;
        for (Map.Entry<Integer, Integer> pair : counter.entrySet()) {
            res[i][0] = pair.getKey();
            res[i][1] = pair.getValue();
            i++;
        }
        return res;
    }
}
