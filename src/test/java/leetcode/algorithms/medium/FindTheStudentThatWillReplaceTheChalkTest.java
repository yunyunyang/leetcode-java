package leetcode.algorithms.medium;

import org.junit.Assert;
import org.junit.Test;

public class FindTheStudentThatWillReplaceTheChalkTest {

    @Test
    public void example1() {
        int[] chalk = {5,1,5};
        int k = 22;
        int output = 0;
        Assert.assertEquals(FindTheStudentThatWillReplaceTheChalk.chalkReplacer(chalk, k), output);
    }

    @Test
    public void example2() {
        int[] chalk = {3,4,1,2};
        int k = 25;
        int output = 1;
        Assert.assertEquals(FindTheStudentThatWillReplaceTheChalk.chalkReplacer(chalk, k), output);
    }

}
