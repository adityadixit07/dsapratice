package Matrix;

public class setMatrixtoZero {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        System.out.println("before: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("after: ");
        setMatrix(matrix);
    }

    // https://leetcode.com/problems/set-matrix-zeroes/description/
    public static void setMatrix(int[][] matrix) {
        boolean row = false;
        boolean col = false;
        // checking that first row contains 0 or no
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                col = true;
            }
        }
        // checking that first col contains 0 or not
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                row = true;
            }
        }
        // traversing the rest array
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;// first col ke ith row ke element ko 0 set kar denge
                    matrix[0][j] = 0; // first row ke jth col ke element ko 0 set kar denge
                }
            }
        }

        // now seeing the first row element and set the matrix element to 0
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        // similarly for fisrt col if 0 encounterd make the row and col
        for (int j = 1; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 0; i < matrix.length; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (row) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }
        if (col) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
