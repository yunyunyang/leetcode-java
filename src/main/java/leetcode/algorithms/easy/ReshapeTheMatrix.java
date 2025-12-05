package leetcode.algorithms.easy;

// 566. Reshape the Matrix
public class ReshapeTheMatrix {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        if (m * n != r * c) {
            return mat;
        }

        int[][] res = new int[r][c];
        for (int i = 0; i < m * n; i++) {
            set(res, i, get(mat, i));
        }
        return res;
    }

    int get(int[][] mat, int index) {
        int n = mat[0].length;
        int r = index / n, c = index % n;
        return mat[r][c];
    }

    void set(int[][] mat, int index, int value) {
        int n = mat[0].length;
        int r = index / n, c = index % n;
        mat[r][c] = value;
    }
}
