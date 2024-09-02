package leetcode.algorithms.medium;

import java.util.Arrays;

// 1894. Find the Student that Will Replace the Chalk
public class FindTheStudentThatWillReplaceTheChalk {

    public static int chalkReplacer(int[] chalk, int k) {
        long s = 0;
        for (int c : chalk) s += c;
        k %= s;

        for (int i = 0; i < chalk.length; i ++) {
            k -= chalk[i];
            if (k < 0) {
                return i;
            }
        }
        return -1;
    }
}
