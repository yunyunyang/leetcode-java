package leetcode.algorithms.easy;

// 1437. Check If All 1's Are at Least Length K Places Away
public class CheckIfAll1sAreAtLeastLengthKPlacesAway {

    public boolean kLengthApart(int[] nums, int k) {
        int count = k;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (i > 0 && count < k) {
                    return false;
                }
                count = 0;
            } else {
                count++;
            }
        }
        return true;
    }
}
