package leetcode.algorithms.easy;

import java.util.HashSet;
import java.util.Set;

// 1346. Check If N and Its Double Exist
public class CheckIfNAndItsDoubleExist {

    public boolean checkIfExist(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        for (int n : arr) {
            if (seen.contains(n * 2) || (n % 2 == 0 && seen.contains(n / 2))) {
                return true;
            }
            seen.add(n);
        }
        return false;
    }
}
