package leetcode.algorithms.medium;

import org.junit.Assert;
import org.junit.Test;

public class JumpGameIITest {

    @Test
    public void test1() {
        int[] nums = {2,3,1,1,4};
        int output = 2;
        Assert.assertEquals(output, new JumpGameII().jump(nums));
    }

    @Test
    public void test2() {
        int[] nums = {2,3,0,1,4};
        int output = 2;
        Assert.assertEquals(output, new JumpGameII().jump(nums));
    }
}
