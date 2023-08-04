<<<<<<< HEAD
import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {
        int[] houses = { 2, 7, 9, 3, 1 };
        // recursion
        // System.out.println(recursive(houses, houses.length - 1));

        // memoization
        // int[] memo = new int[houses.length];
        // Arrays.fill(memo, -1);
        // System.out.println(memoize(houses, houses.length-1, memo));

        // dp
        System.out.println(maxProfit(houses, houses.length));
    }

    public static int maxProfit(int[] arr, int n) {
        int[] dp = new int[n];
        dp[0] = arr[0];
        for (int i = 1; i < n; i++) {
            int take = arr[i];
            if (i > 1) {
                take += dp[i - 2];
            }
            int not_take = dp[i - 1];
            dp[i] = Math.max(take, not_take);
        }
        return dp[n - 1];
    }

    // lets memoize the recurive solution
    public static int memoize(int[] arr, int idx, int[] memo) {
        if (idx == 0) {
            return 0;
        }
        if (memo[idx] != -1) {
            return memo[idx];
        }
        int pick = Integer.MIN_VALUE;
        if (idx >= 2) {
            pick = arr[idx] + recursive(arr, idx - 2);
        }
        int notpick = recursive(arr, idx - 1);
        memo[idx] = Math.max(pick, notpick);
        return memo[idx];
    }

    // constraint-> theif can't loot two consecutive houses
    public static int recursive(int[] arr, int idx) {
        if (idx == 0) {
            return arr[0];
        }
        int pick = Integer.MIN_VALUE;
        if (idx > 1) {
            pick = arr[idx] + recursive(arr, idx - 2);
        }
        int notpick = recursive(arr, idx - 1);
        return Math.max(pick, notpick);
    }
=======
import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {
        int[] houses = { 2, 7, 9, 3, 1 };
        // recursion
        // System.out.println(recursive(houses, houses.length - 1));

        // memoization
        // int[] memo = new int[houses.length];
        // Arrays.fill(memo, -1);
        // System.out.println(memoize(houses, houses.length-1, memo));

        // dp
        System.out.println(maxProfit(houses, houses.length));
    }

    public static int maxProfit(int[] arr, int n) {
        int[] dp = new int[n];
        dp[0] = arr[0];
        for (int i = 1; i < n; i++) {
            int take = arr[i];
            if (i > 1) {
                take += dp[i - 2];
            }
            int not_take = dp[i - 1];
            dp[i] = Math.max(take, not_take);
        }
        return dp[n - 1];
    }

    // lets memoize the recurive solution
    public static int memoize(int[] arr, int idx, int[] memo) {
        if (idx == 0) {
            return 0;
        }
        if (memo[idx] != -1) {
            return memo[idx];
        }
        int pick = Integer.MIN_VALUE;
        if (idx >= 2) {
            pick = arr[idx] + recursive(arr, idx - 2);
        }
        int notpick = recursive(arr, idx - 1);
        memo[idx] = Math.max(pick, notpick);
        return memo[idx];
    }

    // constraint-> theif can't loot two consecutive houses
    public static int recursive(int[] arr, int idx) {
        if (idx == 0) {
            return arr[0];
        }
        int pick = Integer.MIN_VALUE;
        if (idx > 1) {
            pick = arr[idx] + recursive(arr, idx - 2);
        }
        int notpick = recursive(arr, idx - 1);
        return Math.max(pick, notpick);
    }
>>>>>>> 2d1728a29ec5f58401ab3955cd4ff5cbd503c449
}