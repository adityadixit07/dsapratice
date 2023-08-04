package subsequences;

public class CountPartitionWithGivenDiff {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5 };
        int diff = 2;
        int totalSum = 0;
        for (int val : arr) {
            totalSum += val;
        }
        if ((totalSum - diff) < 0 || (totalSum - diff) % 2 != 0) {
            System.out.println("Partition can't possible with given difference.");
        } else {
            int target = (totalSum - diff) / 2;
            System.out.println(totalParitions(arr, target));
        }

    }

    public static int totalParitions(int[] arr, int target) {
        int n = arr.length;
        int[][] dp = new int[n][target + 1];
        if (arr[0] == 0) {
            dp[0][0] = 2;
        } else {
            dp[0][0] = 1;
        }
        if (arr[0] != 0 && arr[0] <= target) {
            dp[0][arr[0]] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= target; j++) {
                int notTake = dp[i - 1][j];
                int take = 0;
                if (arr[i] <= j) {
                    take = dp[i - 1][j - arr[i]];
                }
                dp[i][j] = take + notTake;
            }
        }
        return dp[n - 1][target];
    }
}
