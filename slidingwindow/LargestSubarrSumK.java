class LargestSubarrSumK {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 4, 1, 2, 3, 5 };
        System.out.println(maxSizeofSubarraySumK(arr, 5));
    }

    public static int maxSizeofSubarraySumK(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        int sum = 0;
        while (j < arr.length) {
            sum += arr[j];
            if (sum < k) {
                j++;
            }
            if (sum == k) {
                max = Math.max(max, j - i + 1);
                j++;
            }
            if (sum > k) {
                while (sum > k) {
                    sum -= arr[i];
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}