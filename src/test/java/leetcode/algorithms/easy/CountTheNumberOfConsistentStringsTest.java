package leetcode.algorithms.easy;

import org.junit.Assert;
import org.junit.Test;

public class CountTheNumberOfConsistentStringsTest {

    @Test
    public void test1() {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        int output = 2;
        Assert.assertEquals(CountTheNumberOfConsistentStrings.countConsistentStrings(allowed, words), output);
    }

    @Test
    public void test2() {
        String allowed = "abc";
        String[] words = {"a","b","c","ab","ac","bc","abc"};
        int output = 7;
        Assert.assertEquals(CountTheNumberOfConsistentStrings.countConsistentStrings(allowed, words), output);
    }

    @Test
    public void test3() {
        String allowed = "cad";
        String[] words = {"cc","acd","b","ba","bac","bad","ac","d"};
        int output = 4;
        Assert.assertEquals(CountTheNumberOfConsistentStrings.countConsistentStrings(allowed, words), output);
    }
}
