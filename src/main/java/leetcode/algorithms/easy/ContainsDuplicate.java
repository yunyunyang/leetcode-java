package leetcode.algorithms.easy;

import java.util.HashSet;

// 217. Contains Duplicate
public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                return true;
            }
            set.add(i);
        }
        return false;
    }
}
