package leetcode.algorithms.easy;

// 3498. Reverse Degree of a String
public class ReverseDegreeOfAString {

    public int reverseDegree(String s) {
        int degree = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int product = ('z' - ch + 1) * (i + 1);
            degree += product;
        }
        return degree;
    }
}
