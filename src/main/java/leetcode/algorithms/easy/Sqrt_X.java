package leetcode.algorithms.easy;

// 69. Sqrt(x)
public class Sqrt_X {

    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int output = 0;

        while(left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println(mid);
            if ((long) mid * mid > (long) x) {
                right = mid - 1;
            } else if ((long) mid * mid < (long) x) {
                left = mid + 1;
                output = mid;
            } else {
                return mid;
            }
        }
        return output;
    }
}
