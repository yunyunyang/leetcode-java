package leetcode.algorithms.easy;

// 389. Find the Difference
public class FindTheDifference {

    public char findTheDifference(String s, String t) {
        int res = 0;
        for (char c : s.toCharArray()) {
            res = res ^ c;
        }
        for (char c : t.toCharArray()) {
            res = res ^ c;
        }
        return (char) res;
    }
}
