package BinarySearch;

public class CountNegativeinSortedMatrix {
    public static void main(String[] args){
        int[][] matrix={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-1},{-1,-1,-2,-3}};
        // given that rows and col are sorted in descending order
        System.out.println("Total negative numbers:"+countNegativeNum(matrix));
    }
    public static int countNegativeNum(int[][] matrix){
        int i=0;
        int j=matrix[0].length-1;
        int count=0;
        while(i>=0 && i<matrix.length && j>=0 && j<matrix[0].length){
            if(matrix[i][j]<0){
                j--;
                count+=matrix.length-i;
            }
            else{
                i++;
            }
        }
        return count;
    }
}
