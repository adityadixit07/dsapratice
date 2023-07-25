package subsequences;

public class PartitionSetintoMinAbsDiff {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 4, 3 };
        int target = 0;
        for (int val : arr) {
            target += val;
        }
        System.out.println(minAbsDiff(arr, target)); // dp

    }

    // we have to partition the array in such a way that so that we get the min diff
    // if we subtract the sum of two subset array

    // tc=O(n*target) sc=O(n*target)
    public static int minAbsDiff(int[] arr, int target) {
        boolean[][] dp = new boolean[arr.length][target + 1];
        for (int i = 0; i < arr.length; i++) {
            dp[i][0] = true;
        }
        if (arr[0] <= target) {
            dp[0][arr[0]] = true;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j <= target; j++) {
                boolean NotTake = dp[i - 1][j];
                boolean Take = false;
                if (arr[i] <= j) {
                    Take = dp[i - 1][j - arr[i]];
                }
                dp[i][j] = NotTake | Take;
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= target; i++) {
            if (dp[arr.length - 1][i] == true) {
                int s1 = i;
                int s2 = target - i;
                min = Math.min(min, Math.abs(s1 - s2));
            }
        }
        return min;
    }

    

}
