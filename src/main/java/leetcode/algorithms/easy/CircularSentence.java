package leetcode.algorithms.easy;

// 2490. Circular Sentence
public class CircularSentence {

    public boolean isCircularSentence(String sentence) {
        char[] chars = sentence.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[0] != chars[chars.length - 1]) {
                return false;
            }
            if (chars[i] == ' ' && chars[i - 1] != chars[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
