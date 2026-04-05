package leetcode.algorithms.easy;

import org.junit.Assert;
import org.junit.Test;

public class RobotReturnToOriginTest {

    @Test
    public void example1() {
        String moves = "UD";
        Assert.assertTrue(RobotReturnToOrigin.judgeCircle(moves));
    }

    @Test
    public void example2() {
        String moves = "LL";
        Assert.assertFalse(RobotReturnToOrigin.judgeCircle(moves));
    }
}
