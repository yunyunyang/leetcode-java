package leetcode.algorithms.easy;

// 3042. Count Prefix and Suffix Pairs I
public class CountPrefixAndSuffixPairsI {

    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for (int i = 0; i <= words.length - 1; i++) {
            for (int j = i + 1; j <= words.length - 1; j ++) {
                if (isPrefixAndSuffix(words[i], words[j])) {
                    count ++;
                }
            }
        }
        return count;
    }

    boolean isPrefixAndSuffix(String str1, String str2) {
        return str2.startsWith(str1) && str2.endsWith(str1);
    }
}
