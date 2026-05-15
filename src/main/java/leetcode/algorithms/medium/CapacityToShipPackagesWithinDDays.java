package leetcode.algorithms.medium;

// 1011. Capacity To Ship Packages Within D Days
public class CapacityToShipPackagesWithinDDays {

    public int shipWithinDays(int[] weights, int days) {
        int left = 0, right = 1;
        for (int weight : weights) {
            left = Math.max(left, weight);
            right += weight;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (fun(weights, mid) <= days) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    int fun(int[] weights, int x) {
        int days = 0;
        for (int i = 0; i < weights.length;) {
            int cap = x;
            while (i < weights.length) {
                if (cap < weights[i])
                    break;
                else
                    cap -= weights[i];
                i++;
            }
            days++;
        }
        return days;
    }
}
