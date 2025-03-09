package leetcode.algorithms.medium;

// 3208. Alternating Groups II
public class AlternatingGroupsII {

    public int numberOfAlternatingGroups(int[] colors, int k) {
        int res = 0, left = 0;
        int n = colors.length;
        for (int right = 1; right < n + k - 1; right++) {
            if (colors[right % n] == colors[(right - 1) % n]) {
                left = right;
            }
            if (right - left + 1 > k) {
                left ++;
            }
            if (right - left + 1 == k) {
                res ++;
            }
        }
        return res;
    }
}
