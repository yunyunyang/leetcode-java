package leetcode.algorithms.easy;

// 169. Majority Element
public class MajorityElement {

    public int majorityElement(int[] nums) {
        int target = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                target = num;
                count = 1;
            } else if (num == target) {
                count++;
            } else {
                count--;
            }
        }
        return target;
    }
}
