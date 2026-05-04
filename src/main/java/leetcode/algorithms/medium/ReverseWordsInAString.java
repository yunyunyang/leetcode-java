package leetcode.algorithms.medium;

// 151. Reverse Words in a String
public class ReverseWordsInAString {

    public String reverseWords(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                sb.append(c);
            } else if (!sb.isEmpty() && sb.charAt(sb.length() - 1) != ' ') {
                sb.append(' ');
            }
        }

        if (sb.isEmpty())
            return "";

        if (sb.charAt(sb.length() - 1) == ' ')
            sb.deleteCharAt(sb.length() - 1);

        char[] chars = sb.toString().toCharArray();
        int n = chars.length;
        reverse(chars, 0, n - 1);

        for (int i = 0; i < n; ) {
            for (int j = i; j < n; j++) {
                if (j + i == n || chars[j + 1] == ' ') {
                    reverse(chars, i, j);
                    i = j + 2;
                }
            }
        }
        return new String(chars);
    }

    void reverse(char[] arr, int l, int r) {
        while (l < r) {
            char tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;
            l++;
            r--;
        }
    }
}
