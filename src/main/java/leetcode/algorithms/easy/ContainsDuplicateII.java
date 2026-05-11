package leetcode.algorithms.easy;

import java.util.HashSet;
import java.util.Set;

// 219. Contains Duplicate II
public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int left = 0, right = 0;
        Set<Integer> seen = new HashSet<>();
        while (right < nums.length) {
            if (seen.contains(nums[right]))
                return true;

            seen.add(nums[right]);
            right++;

            while (right - left > k) {
                seen.remove(nums[left]);
                left++;
            }
        }
        return false;
    }
}
