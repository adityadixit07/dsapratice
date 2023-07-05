import java.util.Arrays;

public class NinjaTraining {
    public static void main(String[] args) {
        int tasks[][] = { { 2, 1, 3 }, { 3, 4, 6 }, { 10, 1, 6 }, { 8, 3, 7 } };
        // System.out.println("maximum task done:" + helper_recursive(tasks.length - 1,
        // 3, tasks));
        // int[][] memo = new int[tasks.length][4];
        // int value = -1;
        // for (int[] row : memo) {
        // Arrays.fill(row, value);
        // }
        // System.out.println(memoize(tasks.length - 1, 3, tasks, memo));

        // time to write dp code
        int n = tasks.length;
        int[][] dp = new int[n][4];
        dp[0][0] = Math.max(tasks[0][1], tasks[0][2]);
        dp[0][1] = Math.max(tasks[0][0], tasks[0][2]);
        dp[0][2] = Math.max(tasks[0][0], tasks[0][1]);
        // dp[0][3] = Math.max(tasks[0][0], Math.max(tasks[0][1], tasks[0][2]));
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                dp[i][j] = 0;
                for (int task = 0; task < j; task++) {
                    if (task != j) {
                        int point = tasks[i][task] + dp[i - 1][task];
                        dp[i][j] = Math.max(point, dp[i][j]);
                    }
                }
            }
        }
        System.out.println(dp[n - 1][3]);
    }

    // now its time to memoize the recursive solution
    public static int memoize(int day, int last, int[][] arr, int[][] memo) {
        if (day == 0) {
            int maxi = 0;
            for (int i = 0; i < 3; i++) {
                if (i != last) {
                    maxi = Math.max(maxi, arr[0][i]);
                }
            }
            return maxi;
        }
        if (memo[day][last] != -1) {
            return memo[day][last];
        }
        int maxi = 0;
        for (int task = 0; task < 3; task++) {
            if (task != last) {
                int point = arr[day][task] + memoize(day - 1, task, arr, memo);
                maxi = Math.max(maxi, point);
            }
        }
        return memo[day][last] = maxi;
    }

    // constriant-> ninja cann't do the same activity on two consecutive days
    // recursive appraoch
    public static int helper_recursive(int day, int last, int[][] tasks) {
        if (day == 0) {
            int maxi = 0;
            for (int i = 0; i < 3; i++) {
                if (i != last) {
                    maxi = Math.max(maxi, tasks[0][i]);
                }
            }
            return maxi;
        }
        int maxi = 0;
        for (int task = 0; task < 3; task++) {
            if (task != last) {
                int point = tasks[day][task] + helper_recursive(day - 1, task, tasks);
                maxi = Math.max(maxi, point);
            }
        }
        return maxi;
    }
}
