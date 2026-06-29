package leetcode.algorithms.easy;

// 1967. Number of Strings That Appear as Substrings in Word
public class NumberOfStringsThatAppearAsSubstringsInWord {

    public int numOfStrings(String[] patterns, String word) {
        int res = 0;
        for (String pattern : patterns) {
            if (word.contains(pattern))
                res++;
        }
        return res;
    }
}
