package leetcode.algorithms.medium;

// 2075. Decode the Slanted Ciphertext
public class DecodeTheSlantedCiphertext {

    public static String decodeCiphertext(String encodedText, int rows) {
        if (rows == 1)
            return encodedText;

        int cols = encodedText.length() / rows;
        StringBuilder sb = new StringBuilder();
        for (int col = 0; col < cols; col++) {
            int r = 0, c = col;
            while (r < rows && c < cols) {
                sb.append(encodedText.charAt(r * cols + c));
                r++;
                c++;
            }

        }
        int end = sb.length();
        while (end > 0 && sb.charAt(end - 1) == ' ')
            end--;
        return sb.substring(0, end);
    }
}
