package leetcode.algorithms.easy;

// 1957. Delete Characters to Make Fancy String
public class DeleteCharactersToMakeFancyString {

    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        char prev = s.charAt(0);

        int freq = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == prev) {
                freq ++;
            } else {
                freq = 1;
                prev = s.charAt(i);
            }
            if (freq < 3) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
