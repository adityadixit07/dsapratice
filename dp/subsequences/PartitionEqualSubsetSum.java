package subsequences;

public class PartitionEqualSubsetSum {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 5 };
        int totalSum = 0;
        for (int val : arr) {
            totalSum += val;
        }
        if (totalSum % 2 != 0) {
            System.out.println("Can't partition the array");
        }
        int target = totalSum / 2;
        System.out.println(helper(arr.length - 1, target, arr)); //recursion
        System.out.println(canPartition(arr, target, arr.length)); //dp

    }
    // partition the array in such a way that both subset sum have same
    // [1,3,5] and [4,5] both subset having sum 9
    public static boolean canPartition(int[] arr,int target,int n){
        boolean[][] dp=new boolean[n][target+1];
        for(int i=0;i<n;i++){
            dp[i][0]=true;
        }
        if(arr[0]<=target){
            dp[0][arr[0]]=true;
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<=target;j++){
                boolean notPick=dp[i-1][j];
                boolean pick=false;
                if(arr[i]<=j){
                    pick=dp[i-1][j-arr[i]];
                }
                dp[i][j]=pick|notPick;
            }
        }
        return dp[n-1][target];
    }

    // recursive apporach
    public static boolean helper(int index,int target,int[] arr){
        if(target==0){
            return true;
        }
        if(index==0){
            return arr[0]==target;
        }
        
        // no take
        boolean notTake=helper(index-1, target, arr);
        // take
        boolean take=false;
        if(arr[index]<=target){
        take=helper(index-1, target-arr[index], arr);
        }
        return take|notTake;

    }
}
