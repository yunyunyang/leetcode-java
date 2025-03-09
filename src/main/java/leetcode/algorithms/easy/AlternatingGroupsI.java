package leetcode.algorithms.easy;

// 3206. Alternating Groups I
public class AlternatingGroupsI {

    public int numberOfAlternatingGroups(int[] colors) {
        int res = 0;
        int n = colors.length;
        for (int i = 0; i < n; i++) {
            int prev = (i == 0) ? n - 1 : i - 1;
            int next = (i + 1) % n;
            if (colors[i] != colors[prev] && colors[i] != colors[next]) {
                res ++;
            }
        }
        return res;
    }
}
