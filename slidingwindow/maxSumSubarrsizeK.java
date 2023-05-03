/**
 * maxSumSubarrsizeK
 */
public class maxSumSubarrsizeK {
    public static void main(String[] args) {
        int[] arr = { 100, 200, 400, 700, 300 };
        int k = 2;
        // System.out.println("max sum :"+maxSumSubarr(arr, k));
        System.out.println("max sum :" + maxSubarrSizeK(arr, k));

    }

    // max sum of suubarray of size k
    // brute force appproach
    public static int maxSumSubarr(int[] arr, int k) {
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    // using concept of sliding window
    public static int maxSubarrSizeK(int[] arr, int k) {
        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        while (j < arr.length) {
            sum += arr[j];
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                max = Math.max(max, sum);
                sum = sum - arr[i];
                i++;
                j++;
            }
        }
        return max;
    }
}