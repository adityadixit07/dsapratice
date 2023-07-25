package Matrix;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        printMatrixSpiral(matrix);
    }

    // Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
    // Output: [1,2,3,6,9,8,7,4,5]
    public static void printMatrixSpiral(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int rowStart = 0;
        int rowEnd = row - 1;
        int colStart = 0;
        int colEnd = col - 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = colStart; i <= colEnd; i++) {
                System.out.print(matrix[rowStart][i] + ",");
                
            }
            rowStart = rowStart + 1;
            for (int i = rowStart; i <= rowEnd; i++) {
                System.out.print(matrix[i][colEnd] + ",");
               
            }
            colEnd = colEnd - 1;
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    System.out.print(matrix[rowEnd][i] + ",");
                  
                }
                rowEnd = rowEnd - 1;
            }
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    System.out.print(matrix[i][colStart] + ",");
                   
                }
                colStart = colStart + 1;
            }
        }
    }
}