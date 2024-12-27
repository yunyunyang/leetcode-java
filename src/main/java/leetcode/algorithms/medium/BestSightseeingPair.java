package leetcode.algorithms.medium;

// 1014. Best Sightseeing Pair
public class BestSightseeingPair {

    public int maxScoreSightseeingPair(int[] values) {
        int maxScore = 0;
        int curMax = values[0] - 1;
        for (int i = 1; i < values.length; i++) {
            maxScore = Math.max(maxScore, curMax + values[i]);
            curMax = Math.max(curMax - 1, values[i] - 1);
        }
        return maxScore;
    }
}
