package leetcode.algorithms.easy;

// 796. Rotate String
public class RotateString {

    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String ss = s + s;
        return ss.contains(goal);
    }
}
