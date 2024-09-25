package leetcode.algorithms.medium;

// 34. Find First and Last Position of Element in Sorted Array
public class FindFirstAndLastPositionOfElementInSortedArray {

    public int[] searchRange(int[] nums, int target) {
        int [] result = {-1, -1};
        if (nums.length == 0) {
            return result;
        }

        int left = 0;
        int right = nums.length - 1;

        result[0] = findFirst(left, right, nums, target);
        result[1] = findLast(left, right, nums, target);
        return result;
    }

    private int findFirst(int left, int right, int[] nums, int target) {
        while (left <= right) {
            int mid = (int)Math.floor(left + (right - left) / 2);
            if (nums[mid] == target) {
                if (mid == 0 || nums[mid - 1] != target) {
                    return mid;
                } else {
                    right = mid - 1;
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    private int findLast(int left, int right, int[] nums, int target) {
        while (left <= right) {
            int mid = (int)Math.floor(left + (right - left) / 2);
            if (nums[mid] == target) {
                if (mid == nums.length - 1 || nums[mid + 1] != target) {
                    return mid;
                } else {
                    left = mid + 1;
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
