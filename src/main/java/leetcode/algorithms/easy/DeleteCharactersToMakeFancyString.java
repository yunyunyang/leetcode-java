package leetcode.algorithms.easy;

// 1957. Delete Characters to Make Fancy String
public class DeleteCharactersToMakeFancyString {

    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int size = sb.length();
            if (size >= 2 && s.charAt(i) == sb.charAt(size - 1) && s.charAt(i) == sb.charAt(size - 2)) {
                continue;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
