package leetcode.algorithms.easy;

// 3783. Mirror Distance of an Integer
public class MirrorDistanceOfAnInteger {

    public int mirrorDistance(int n) {
        int target = n;
        int reversed = 0;
        while (target > 0) {
            int remainder = target % 10;
            target /= 10;
            reversed = reversed * 10 + remainder;
        }
        return Math.abs(n - reversed);
    }
}
