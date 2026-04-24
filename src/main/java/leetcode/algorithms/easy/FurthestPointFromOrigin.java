package leetcode.algorithms.easy;

// 2833. Furthest Point From Origin
public class FurthestPointFromOrigin {

    public int furthestDistanceFromOrigin(String moves) {
        int left = 0, right = 0, other = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'L')
                left++;
            else if (moves.charAt(i) == 'R')
                right++;
            else
                other++;
        }
        return Math.abs(left - right) + other;
    }
}
