package leetcode.algorithms.easy;

// 1385. Find the Distance Value Between Two Arrays
public class FindTheDistanceValueBetweenTwoArrays {

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int res = 0;
        for (int i = 0; i < arr1.length; i++) {
            boolean valid = true;
            for (int j = 0; j < arr2.length; j++) {
                if (Math.abs(arr1[i] - arr2[j]) <= d) {
                    valid = false;
                    break;
                }
            }
            if (valid)
                res++;
        }
        return res;
    }
}
