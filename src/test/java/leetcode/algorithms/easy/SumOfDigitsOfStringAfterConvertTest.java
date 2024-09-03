package leetcode.algorithms.easy;

import org.junit.Assert;
import org.junit.Test;

public class SumOfDigitsOfStringAfterConvertTest {

    @Test
    public void example1() {
        String s = "iiii";
        int k = 1;
        int output = 36;
        Assert.assertEquals(SumOfDigitsOfStringAfterConvert.getLucky(s, k), output);
    }

    @Test
    public void example2() {
        String s = "leetcode";
        int k = 2;
        int output = 6;
        Assert.assertEquals(SumOfDigitsOfStringAfterConvert.getLucky(s, k), output);
    }

    @Test
    public void example3() {
        String s = "zbax";
        int k = 2;
        int output = 8;
        Assert.assertEquals(SumOfDigitsOfStringAfterConvert.getLucky(s, k), output);
    }
}
