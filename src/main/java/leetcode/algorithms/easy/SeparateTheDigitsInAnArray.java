package leetcode.algorithms.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 2553. Separate the Digits in an Array
public class SeparateTheDigitsInAnArray {

    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            while (nums[i] > 0) {
                list.add(nums[i] % 10);
                nums[i] = nums[i] / 10;
            }
        }

        Collections.reverse(list);
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
