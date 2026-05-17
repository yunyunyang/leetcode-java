package leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.List;

// 442. Find All Duplicates in an Array
public class FindAllDuplicatesInAnArray {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int num : nums) {
            if (nums[Math.abs(num) - 1] < 0) {
                res.add(Math.abs(num));
            } else {
                nums[Math.abs(num) - 1] *= -1;
            }
        }
        return res;
    }
}
