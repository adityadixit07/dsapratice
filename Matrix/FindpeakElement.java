package Matrix;

public class FindpeakElement {
    public static void main(String[] args) {
        int[][] mat={{10,20,15},{21,30,14},{7,16,32}};
        int[] res=findPeak(mat);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static int[] findPeak(int[][] mat){
        int row=mat.length;
        int col=mat[0].length;
        // array for storing answer
        int[] res=new int[2];
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                // checking top element
                if(i>0){
                    if(mat[i-1][j]>mat[i][j]){
                        continue;
                    }
                }
                // checking for right element
                if(j<col-1){
                    if(mat[i][j]<mat[i][j+1]){
                        continue;
                    }
                }
                // checking for bottom element
                if(i<row-1){
                    if(mat[i][j]<mat[i+1][j]){
                        continue;
                    }
                }
                // checking for left element
                if(j>0){
                    if(mat[i][j]<mat[i][j-1]){
                        continue;
                    }
                }
                res[0]=i;
                res[1]=j;
                break;
            }
        }
        return res;
    }
}
