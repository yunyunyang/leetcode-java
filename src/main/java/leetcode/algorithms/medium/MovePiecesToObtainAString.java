package leetcode.algorithms.medium;

// 2337. Move Pieces to Obtain a String
public class MovePiecesToObtainAString {

    public boolean canChange(String start, String target) {
        if (!start.replace("_", "").equals(target.replace("_", ""))) {
            return false;
        }
        int j = 0;
        for (int i = 0; i < start.length(); i++) {
            if (start.charAt(i) == 'L') {
                while (j < target.length() && target.charAt(j) != 'L') j++;
                if (i < j) return false;
                j++;
            } else if (start.charAt(i) == 'R') {
                while (j < target.length() && target.charAt(j) != 'R') j++;
                if (i > j) return false;
                j++;
            }
        }
        return true;
    }
}
