package leetcode.algorithms.medium;

// 1094. Car Pooling
public class CarPooling {

    public boolean carPooling(int[][] trips, int capacity) {
        int[] diff = new int[1001];
        for (int[] trip : trips) {
            int val = trip[0];
            int i = trip[1];
            int j = trip[2] - 1;

            diff[i] += val;
            if (j + 1 < 1001) {
                diff[j + 1] -= val;
            }
        }

        int[] res = new int[1001];
        res[0] = diff[0];
        for (int i = 1; i < res.length; i++) {
            res[i] = res[i - 1] + diff[i];
        }

        for (int i = 0; i < res.length; i++) {
            if (res[i] > capacity)
                return false;
        }
        return true;
    }
}
