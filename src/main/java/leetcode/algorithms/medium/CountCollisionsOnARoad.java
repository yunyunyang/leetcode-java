package leetcode.algorithms.medium;

// 2211. Count Collisions on a Road
public class CountCollisionsOnARoad {

    public int countCollisions(String directions) {
        int left = 0;
        int right = directions.length() - 1;
        while (left <= right && directions.charAt(left) == 'L') {
            left++;
        }

        while (right >= left && directions.charAt(right) == 'R') {
            right--;
        }

        int res = 0;
        for (int i = left; i <= right; i++) {
            if (directions.charAt(i) != 'S') {
                res++;
            }
        }
        return res;
    }
}
