package leetcode.algorithms.medium;

// 769. Max Chunks To Make Sorted
public class MaxChunksToMakeSorted {

    public int maxChunksToSorted(int[] arr) {
        int chunks = 0;
        int curSum = 0;
        for (int i = 0; i < arr.length; i++) {
            curSum += i - arr[i];
            if (curSum == 0) {
                chunks ++;
            }
        }
        return chunks;
    }
}
