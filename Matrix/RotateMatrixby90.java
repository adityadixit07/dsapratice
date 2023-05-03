package Matrix;
// do rotation inpkace means donot use extra space
public class RotateMatrixby90 {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("original matrix:");
        printmatrix(matrix);
        rotateMatrix(matrix);
        System.out.println("After rotation:");
        printmatrix(matrix);
    }
    // https://leetcode.com/problems/rotate-image/description/
    public static void rotateMatrix(int[][] matrix){
        // appraoch  first transpose the atrix then after reverse the rows of the trasposed matrix
        // transpose
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        // reverse the rows of the transposed matrix
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j]=temp;
            }
        }
    }
    public static void printmatrix(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
        System.out.println();
        }
    }
}
