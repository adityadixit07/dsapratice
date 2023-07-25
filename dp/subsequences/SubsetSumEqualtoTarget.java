package subsequences;

public class SubsetSumEqualtoTarget {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 1 };
        int target = 4;
        System.out.println(helper(arr.length-1, arr, target)); //recursive-sol
        System.out.println(subsetSumtoK(arr, target, arr.length));
    }
    // task to check there exist a subset whose sum equal to target
    public static boolean subsetSumtoK(int[] arr,int target,int n){
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

    // recursive approach
    public static boolean helper(int index, int[] arr, int target) {
        if (index < 0) {
            return false;
        }
        if (target == 0) {
            return true;
        }
        if (index == 0) {
            return arr[0] == target;
        }
        // Not take
        boolean notPickUp = helper(index - 1, arr, target);
        boolean pickUp = false;
        if (arr[index] <= target) {
            pickUp = helper(index - 1, arr, target - arr[index]);
        }
        return pickUp|notPickUp;
    }
}
