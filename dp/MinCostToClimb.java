<<<<<<< HEAD
public class MinCostToClimb {
    public static void main(String[] args) {
        int[] arr = { 10, 15, 20 };

        // recursive solution
        System.out.println(mincost(arr, arr.length - 1));

        // dp solution
        System.out.println(minimiseCost(arr));

        // space optimised version
        System.out.println(minizationOfCost(arr));
    }

    public static int minimiseCost(int[] arr) {
        int n = arr.length;
        int dp[] = new int[n];
        dp[0] = arr[0];
        dp[1] = arr[1];
        for (int i = 2; i < n; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + arr[i];
        }
        return Math.min(dp[n - 1], dp[n - 2]);
    }

    // space optimised solution
    public static int minizationOfCost(int[] arr) {
        int n = arr.length;
        int fs = arr[0];
        int ss = arr[1];
        for (int i = 2; i < n; i++) {
            int curr = arr[i] + Math.min(fs, ss);
            fs = ss;
            ss = curr;
        }
        return fs;
    }

    // recursive apporach
    public static int mincost(int[] arr, int idx) {
        if(idx==0){
            return 0;
        }
        if (idx == 1) {
            return Math.min(arr[0], arr[1]);
        }
        return Math.min(mincost(arr, idx - 1), mincost(arr, idx - 2)) + arr[idx];
    }
=======
public class MinCostToClimb {
    public static void main(String[] args) {
        int[] arr = { 10, 15, 20 };

        // recursive solution
        System.out.println(mincost(arr, arr.length - 1));

        // dp solution
        System.out.println(minimiseCost(arr));

        // space optimised version
        System.out.println(minizationOfCost(arr));
    }

    public static int minimiseCost(int[] arr) {
        int n = arr.length;
        int dp[] = new int[n];
        dp[0] = arr[0];
        dp[1] = arr[1];
        for (int i = 2; i < n; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + arr[i];
        }
        return Math.min(dp[n - 1], dp[n - 2]);
    }

    // space optimised solution
    public static int minizationOfCost(int[] arr) {
        int n = arr.length;
        int fs = arr[0];
        int ss = arr[1];
        for (int i = 2; i < n; i++) {
            int curr = arr[i] + Math.min(fs, ss);
            fs = ss;
            ss = curr;
        }
        return fs;
    }

    // recursive apporach
    public static int mincost(int[] arr, int idx) {
        if(idx==0){
            return 0;
        }
        if (idx == 1) {
            return Math.min(arr[0], arr[1]);
        }
        return Math.min(mincost(arr, idx - 1), mincost(arr, idx - 2)) + arr[idx];
    }
>>>>>>> 2d1728a29ec5f58401ab3955cd4ff5cbd503c449
}