package leetcode.algorithms.medium;

// 3163. String Compression III
public class StringCompressionIII {

    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        char curChar = word.charAt(0);
        int count = 1;
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == curChar && count < 9) {
                count ++;
            } else {
                sb.append(count).append(curChar);
                curChar = word.charAt(i);
                count = 1;
            }
        }
        sb.append(count).append(curChar);
        return sb.toString();
    }
}
