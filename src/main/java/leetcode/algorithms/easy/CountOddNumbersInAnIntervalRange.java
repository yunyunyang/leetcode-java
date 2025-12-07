package leetcode.algorithms.easy;

// 1523. Count Odd Numbers in an Interval Range
public class CountOddNumbersInAnIntervalRange {

    public int countOdds(int low, int high) {
        if ((high - low + 1) % 2 == 0) {
            return (high - low + 1) / 2;
        } else {
            if (low % 2 == 0 && high % 2 == 0) {
                return (high - low + 1) / 2;
            } else {
                return (high - low + 1) / 2 + 1;
            }
        }
    }
}
