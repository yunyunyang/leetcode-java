package leetcode.algorithms.medium;

// 162. Find Peak Element
public class FindPeakElement {

    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (int) Math.floor(left + (right - left) / 2);
            if (mid > 0 && nums[mid - 1] > nums[mid]) {
                right = mid -1;
            } else if (mid < nums.length - 1 && nums[mid + 1] > nums[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
