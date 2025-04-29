package leetcode.algorithms.medium;

import java.util.HashSet;
import java.util.Set;

// 79. Word Search
public class WordSearch {
    private int rows, cols;
    private Set<String> visit = new HashSet<>();

    public boolean exist(char[][] board, String word) {
        rows = board.length;
        cols = board[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (dfs(board, word, r, c, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int r, int c, int i) {
        if (i == word.length())
            return true;

        if (r < 0 || c < 0 || r >= rows || c >= cols ||
                board[r][c] != word.charAt(i) || visit.contains(r + "," + c)) {
            return false;
        }

        visit.add(r + "," + c);
        boolean res = dfs(board, word, r + 1, c, i + 1) || dfs(board, word, r - 1, c, i + 1) ||
                dfs(board, word, r, c + 1, i + 1) || dfs(board, word, r, c - 1, i + 1);
        visit.remove(r + "," + c);
        return res;
    }
}
