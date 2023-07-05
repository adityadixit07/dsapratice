public class SubsetSumEqualtoK {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int k=4;
        System.out.println(isPresent(arr, k));
        System.out.println(isPresentMemoized(arr, k));
    }

    // recursive code
    public static boolean isPresent(int[]arr,int k){
        return isHelper(arr,0,0,k);
    }
    public static boolean isHelper(int[] arr,int idx,int sum,int k){
        if(idx==arr.length){
            if(sum==k){
                return true;
            }
            else{
                return false;
            }
        }
        if(sum==k){
            return true;
        }
        // pick
        boolean pick=isHelper(arr, idx+1, sum+arr[idx], k);
        // not pick case
        boolean notPick=isHelper(arr, idx+1, sum, k);
        return pick||notPick;
    }


    // memoization approach -> top down
    public static boolean isPresentMemoized(int[] arr,int k){
        boolean[][] memo=new boolean[arr.length+1][k+1];
        for(int i=0;i<memo.length;i++){
            for(int j=0;j<memo[0].length;j++){
                memo[i][j]=false;
            }
        }
        return memoized(arr, 0, 0, k, memo);
    }

    public static boolean memoized(int[] arr,int idx,int sum,int k,boolean[][] memo){
        if(idx==arr.length){
            if(k==sum){
                return true;
            }
            else{
                return false;
            }
        }
        // if the result is previously present
        if(memo[arr.length][k]!=false){
            return true;
        }
        boolean x=memoized(arr, idx+1, sum+arr[idx], k, memo);
        boolean y=memoized(arr, idx+1, sum, k, memo);
        memo[arr.length][k]=x||y;
        return memo[arr.length][k];
    }

    // dp approach 
    
}