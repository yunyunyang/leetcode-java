package leetcode.algorithms.easy;

import java.util.ArrayList;
import java.util.List;

// 448. Find All Numbers Disappeared in an Array
public class FindAllNumbersDisappearedInAnArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int num : nums) {
            if (nums[Math.abs(num) - 1] < 0) {

            } else {
                nums[Math.abs(num) - 1] *= -1;
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                res.add(i + 1);
        }
        return res;
    }
}
