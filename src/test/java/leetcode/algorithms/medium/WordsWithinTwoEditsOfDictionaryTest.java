package leetcode.algorithms.medium;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class WordsWithinTwoEditsOfDictionaryTest {

    @Test
    public void example1() {
        String[] queries = {"word", "note", "ants", "wood"};
        String[] dictionary = {"wood", "joke", "moat"};
        List<String> expected = List.of("word","note","wood");
        assertEquals(expected, WordsWithinTwoEditsOfDictionary.twoEditWords(queries, dictionary));
    }

    @Test
    public void example2() {
        String[] queries = {"yes"};
        String[] dictionary = {"not"};
        List<String> expected = List.of();
        assertEquals(expected, WordsWithinTwoEditsOfDictionary.twoEditWords(queries, dictionary));
    }

    @Test
    public void example3() {
        String[] queries = {"tsl","sri","yyy","rbc","dda","qus","hyb","ilu","ahd"};
        String[] dictionary = {"uyj","bug","dba","xbe","blu","wuo","tsf","tga"};
        List<String> expected = List.of("tsl","yyy","rbc","dda","qus","hyb","ilu");
        assertEquals(expected, WordsWithinTwoEditsOfDictionary.twoEditWords(queries, dictionary));
    }
}
