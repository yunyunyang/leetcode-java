package leetcode.algorithms.easy;

// 1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence
public class CheckIfAWordOccursAsAPrefixOfAnyWordInASentence {

    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() >= searchWord.length()) {
                int j = 0;
                while (j < searchWord.length() && word.charAt(j) == searchWord.charAt(j)) {
                    j ++;
                }
                if (j == searchWord.length()) {
                    return i + 1;
                }
            }
        }
        return -1;
    }
}
