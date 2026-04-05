package leetcode.algorithms.easy;

// 657. Robot Return to Origin
public class RobotReturnToOrigin {

    public static boolean judgeCircle(String moves) {
        int[] ch = new int[26];
        for (char c : moves.toCharArray()) {
            ch[c - 'A']++;
        }
        return ch['U' - 'A'] == ch['D' - 'A'] &&
                ch['L' - 'A'] == ch['R' - 'A'];
    }
}
