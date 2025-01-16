package leetcode.algorithms.medium;

// 2425. Bitwise XOR of All Pairings
public class BitwiseXOROfAllPairings {

    public int xorAllNums(int[] nums1, int[] nums2) {
        int res = 0;
        if (nums1.length % 2 == 1) {
            for (int i = 0; i < nums2.length; i++) {
                res ^= nums2[i];
            }
        }
        if (nums2.length % 2 == 1) {
            for (int i = 0; i < nums1.length; i++){
                res ^= nums1[i];
            }
        }
        return res;
    }
}
