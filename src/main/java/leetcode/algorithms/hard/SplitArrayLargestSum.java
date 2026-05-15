package leetcode.algorithms.hard;

// 410. Split Array Largest Sum
public class SplitArrayLargestSum {

    public int splitArray(int[] nums, int k) {
        int left = 0, right = 1;
        for (int num : nums) {
            left = Math.max(left, num);
            right += num;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (fun(nums, mid) <= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    int fun(int[] nums, int x) {
        int target = 0;
        for (int i = 0; i < nums.length;) {
            int cap = x;
            while (i < nums.length) {
                if (cap < nums[i])
                    break;
                else
                    cap -= nums[i];
                i++;
            }
            target++;
        }
        return target;
    }
}
