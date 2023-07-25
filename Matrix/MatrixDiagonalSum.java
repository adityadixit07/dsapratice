package Matrix;

class MatrixDiagonalSum{
    public static void main(String[] args){
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("matrix diagonal sum:"+Sum(mat));
    }
    public static int Sum(int[][] mat){
        int row=mat.length;
        int col=mat[0].length;
        int ps=0;
        int ss=0;
        int i=0;
        while(col>0 && i<row){
            ss+=mat[i][col-1];
            ps+=mat[i][i];
            i++;
            col--;
        }
        
        if(row%2==0){
            return ps+ss;
        }
        // if matrix length is odd then count mid value one time
        else{
            int sum=ps+ss;
            return sum-mat[row/2][row/2];
        }
    }
}