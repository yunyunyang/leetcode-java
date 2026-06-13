package leetcode.algorithms.easy;

// 3838. Weighted Word Mapping
public class WeightedWordMapping {

    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            int weight = 0;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                weight += weights[c - 'a'];
            }
            sb.append((char) ('z' - weight % 26));
        }
        return sb.toString();
    }
}
