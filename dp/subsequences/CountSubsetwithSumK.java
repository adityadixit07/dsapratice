package subsequences;

public class CountSubsetwithSumK {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 3 };
        int k = 3;
        System.out.println(helper(arr.length - 1, k, arr)); // recursion tc=O(2^n*k) sc=O(n)
        System.out.println(countSubsets(arr, k)); // dp => tc=O(n*k) sc=O(n*k)
        System.out.println(countSubsets_spaceOptimised(arr, k));// tc=O(n*k) sc=O(k+k)
    }

    public static int countSubsets(int[] arr, int k) {
        int n = arr.length;
        int[][] dp = new int[n][k + 1];
        // ye basecasae hai agar current element target ke equal ho
        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }
        // target 0 to return 1 wala case handle kar liya
        if (arr[0] <= k) {
            dp[0][arr[0]] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= k; j++) {
                int notPick = dp[i - 1][j];
                int pick = 0;
                if (arr[i] <= j) {
                    pick = dp[i - 1][j - arr[i]];
                }
                dp[i][j] = pick + notPick;
            }
        }
        return dp[n - 1][k];
    }

    public static int countSubsets_spaceOptimised(int[] arr, int k) {
        int n = arr.length;
        int[] curr = new int[k + 1];
        //agar pahla element hi target huaa
        curr[0] = 1;
        // target 0 to return 1 wala case handle kar liya
        if (arr[0] <= k) {
            curr[arr[0]] = 1;
        }
        for (int i = 1; i < n; i++) {
            int[] prev = new int[k + 1];
            for (int j = 0; j <= k; j++) {
                int notPick = curr[j];
                int pick = 0;
                if (arr[i] <= j) {
                    pick = curr[j - arr[i]];
                }
                prev[j] = pick + notPick;
            }
            curr = prev;
        }
        return curr[k];
    }

    public static int helper(int index, int target, int[] arr) {
        if (target == 0)
            return 1;
        if (index == 0) {
            if (arr[index] == target) {
                return 1;
            } else {
                return 0;
            }
        }
        int notTake = helper(index - 1, target, arr);
        int take = 0;
        if (arr[index] <= target) {
            take = helper(index - 1, target - arr[index], arr);
        }
        return take + notTake;
    }
}
