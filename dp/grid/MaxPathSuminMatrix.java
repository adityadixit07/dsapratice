
public class MaxPathSuminMatrix {
    public static void main(String[] args) {
        int[][] grid = { { 1, 1, 100 }, { 2, 2, 3 }, { 3, 10, 2 } };
        int n = grid.length;
        int m = grid[0].length;
        // System.out.println(helper(n - 1, m - 1, grid)); //recursion 
        // System.out.println(maxpathsum(grid, n, m)); //dp
        System.out.println(maxSum_dpOptimised(grid, n, m));//space optimisation solution
    }

    // possible moves (i+1)(j),(i+1)(j+1),(i+1)(j-1) person can start fron any where
    // in first row
    // and end at any where in last row
    public static int maxpathsum(int[][] grid, int n, int m) {
        int[][] dp = new int[n][m];
        // base case
        for (int j = 0; j < m; j++) {
            dp[0][j] = grid[0][j];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int up = grid[i][j] + dp[i - 1][j];
                int left_diagonal = grid[i][j];
                if (j - 1 >= 0) {
                    left_diagonal += dp[i - 1][j - 1];
                } else {
                    left_diagonal += -(int) Math.pow(10, 9);
                }
                int right_diagonal = grid[i][j];
                if (j + 1 < m) {
                    right_diagonal += dp[i - 1][j + 1];
                } else {
                    right_diagonal += -(int) Math.pow(10, 9);
                }
                dp[i][j] = Math.max(up, Math.max(left_diagonal, right_diagonal));
            }
        }
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            maxi = Math.max(maxi, dp[n - 1][i]);
        }
        return maxi;
    }
    //optimising dp solution 
    public static int maxSum_dpOptimised(int[][] arr,int row,int col){
        int[] prev=new int[col];
        for(int j=0;j<col;j++){
            prev[j]=arr[0][j];
        }
        for(int i=1;i<row;i++){
            int[] curr=new int[col];
            for(int j=0;j<col;j++){
                int up=arr[i][j]+prev[j];
                int left_diagonal=arr[i][j];
                if(j-1>=0){
                    left_diagonal+=prev[j-1];
                }
                int right_diagonal=arr[i][j];
                if(j+1<col){
                    right_diagonal+=prev[j+1];
                }
                curr[j]=Math.max(up, Math.max(left_diagonal, right_diagonal));
            }
            prev=curr;
        }
        int maxi=0;
        for(int j=0;j<col;j++){
            maxi=Math.max(maxi,prev[j]);
        }
        return maxi;
    }

    public static int helper(int i, int j, int[][] grid) {
        if (j < 0 || j >= grid[0].length) {
            return -(int) Math.pow(10, 9);
        }
        if (i == 0) {
            return grid[0][j];
        }
        int up = grid[i][j] + helper(i - 1, j, grid);
        int left_diagonal = grid[i][j] + helper(i - 1, j - 1, grid);
        int right_diagonal = grid[i][j] + helper(i - 1, j + 1, grid);
        return Math.max(up, Math.max(left_diagonal, right_diagonal));
    }
}
