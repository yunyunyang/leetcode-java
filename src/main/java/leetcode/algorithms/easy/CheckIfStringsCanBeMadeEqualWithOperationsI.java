package leetcode.algorithms.easy;

// 2839. Check if Strings Can be Made Equal With Operations I
public class CheckIfStringsCanBeMadeEqualWithOperationsI {

    public boolean canBeEqual(String s1, String s2) {
        if (s1.equals(s2))
            return true;

        boolean oddSwap = s1.charAt(0) == s2.charAt(2) && s1.charAt(2) == s2.charAt(0);
        boolean evenSwap = s1.charAt(1) == s2.charAt(3) && s1.charAt(3) == s2.charAt(1);
        boolean oddEqual = s1.charAt(0) == s2.charAt(0) && s1.charAt(2) == s2.charAt(2);
        boolean evenEqual = s1.charAt(1) == s2.charAt(1) && s1.charAt(3) == s2.charAt(3);
        if ((oddSwap && evenEqual) || (oddEqual && evenSwap) || (oddSwap && evenSwap))
            return true;

        return false;
    }
}
