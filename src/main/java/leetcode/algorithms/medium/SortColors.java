package leetcode.algorithms.medium;

// 75. Sort Colors
public class SortColors {

    public void sortColors(int[] nums) {
        int p0 = 0, p2 = nums.length - 1;
        int p = 0;
        while (p <= p2) {
            if (nums[p] == 0) {
                swap(nums, p0, p);
                p0++;
            } else if (nums[p] == 1) {
                p++;
            } else if (nums[p] == 2) {
                swap(nums, p2, p);
                p2--;
            }

            if (p < p0)
                p = p0;
        }
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
