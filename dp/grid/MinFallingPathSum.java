
public class MinFallingPathSum {
    public static void main(String[] args) {
        int[][] arr = { { 2 }, { 3, 4 }, { 6, 5, 7 }, { 4, 1, 8, 3 } };
        // System.out.println(helper(arr.length - 1, arr.length - 1, arr));
        System.out.println(minfallingpathsum(arr, arr.length));
    }
    // 2
    // 3 4
    // 6 5 7
    // 4 1 8 3
    // Given a triangle array, return the minimum path sum from top to bottom.
    // For each step, you may move to an adjacent number of the row below. More
    // formally, if you are on index i on the current row, you may move to either
    // index i or index i + 1 on the next row.
    public static int minfallingpathsum(int[][] arr,int n){
        int[][] dp=new int[n][n];
        for(int j=0;j<n;j++){
            dp[n-1][j]=arr[n-1][j];
        }
        for(int i=n-2;i>=0;i--){
            for(int j=i;j>=0;j--){
                int down=arr[i][j]+dp[i+1][j];
                int diagonal=arr[i][j]+dp[i+1][j+1];
                dp[i][j]=Math.min(down,diagonal);
            }
        }
        return dp[0][0];
    }
    public static int helper(int i, int j, int[][] arr) {
        if (i == arr.length - 1) {
            return arr[arr.length-1][j];
        }
        int down = arr[i][j] + helper(i + 1, j, arr);
        int diagonal = arr[i][j] + helper(i + 1, j + 1, arr);
        return Math.min(down, diagonal);
    }
}
