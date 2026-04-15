package leetcode.algorithms.easy;

// 2515. Shortest Distance to Target String in a Circular Array
public class ShortestDistanceToTargetStringInACircularArray {

    public int closestTarget(String[] words, String target, int startIndex) {
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                int diff = Math.abs(i - startIndex);
                int dist = Math.min(diff, words.length - diff);
                res = Math.min(res, dist);
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
