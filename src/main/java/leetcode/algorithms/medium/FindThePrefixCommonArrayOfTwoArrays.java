package leetcode.algorithms.medium;

import java.util.HashSet;
import java.util.Set;

// 2657. Find the Prefix Common Array of Two Arrays
public class FindThePrefixCommonArrayOfTwoArrays {

    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] res = new int [A.length];
        Set<Integer> once = new HashSet<>();
        Set<Integer> twice = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (!once.contains(A[i])) {
                once.add(A[i]);
            } else if (once.contains(A[i]) && !twice.contains(A[i])) {
                twice.add(A[i]);
            }
            if (!once.contains(B[i])) {
                once.add(B[i]);
            } else if (once.contains(B[i]) && !twice.contains(B[i])) {
                twice.add(B[i]);
            }
            res[i] = twice.size();
        }
        return res;
    }
}
