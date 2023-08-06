package subsequences;

public class TargetSum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1 };
        int target = 3;
        int ts = 0;
        for (int val : arr) {
            ts += val;
        }
        if ((ts - target) < 0 || (ts - target) % 2 != 0) {
            System.out.println("No possible ways.");
        }
        int d = (ts - target) / 2;
        System.out.println(helper(arr.length - 1, arr, d));
        System.out.println(totalWays(arr, d)); //sc=O(n*d) tc=O(n*n)
    }

    // we have to find that in how many ways we can assign the sign to get the
    // target

    public static int totalWays(int[] arr,int d){
        int[][] dp=new int[arr.length][d+1];
        if(arr[0]==0){
            dp[0][0]=2;
        }
        else{
            dp[0][0]=0;
        }
        if(arr[0]<=d){
            dp[0][arr[0]]=1;
        }
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<=d;j++){
                int nottake=dp[i-1][j];
                int take=0;
                if(arr[i]<=j){
                    take=1+dp[i-1][j-arr[i]];
                }
                dp[i][j]=take+nottake;
            }
        }
        return dp[arr.length-1][d];
    }

    public static int helper(int index, int[] arr, int target) {
        if (index == 0) {
            if (arr[index] == target) {
                return 1;
            } else {
                return 0;
            }
        }
        int notPick = helper(index - 1, arr, target);
        int pick = 0;
        if (arr[index] <= target) {
            pick = 1 + helper(index - 1, arr, target - arr[index]);
        }
        return notPick + pick;
    }
}
