package Matrix;

public class Search2Dmatrix {
    public static void main(String[] args) {
        int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=3;
        System.out.println(searchMatrix(matrix, target));
    }
    // here condition is given that rows and columns are sorted increasingly
    public static int searchMatrix(int[][] matrix,int target){
        int i=0;
        int j=matrix[0].length-1;
        while(i>=0 && i<matrix.length && j>=0 && j<matrix[0].length){
            if(matrix[i][j]==target){
                return 1;
            }
            else if(matrix[i][j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        return -1;
    }
    // time complexity O(m+n);
}
