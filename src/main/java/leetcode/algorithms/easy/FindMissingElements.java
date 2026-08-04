package leetcode.algorithms.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 3731. Find Missing Elements
public class FindMissingElements {

    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int min = 101, max = 0;
        for (int num : nums) {
            set.add(num);

            if (num < min)
                min = num;
            if (num > max)
                max = num;
        }

        List<Integer> res = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                res.add(i);
            }
        }
        return res;
    }
}
