package leetcode.algorithms.medium;

// 2109. Adding Spaces to a String
public class AddingSpacesToAString {

    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int cur_space = 0;
        for (int i = 0; i < s.length(); i++) {
            if (cur_space < spaces.length && spaces[cur_space] == i) {
                sb.append(" ");
                cur_space++;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
