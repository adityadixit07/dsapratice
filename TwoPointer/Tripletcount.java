package TwoPointer;

public class Tripletcount {
    public static void main(String[] args) {
        int[] arr = { 2, 14, 8, 5, 17, 11, 12, 12 };
        int triplet_sum = 14;
        findPairs(arr, triplet_sum);
    }

    public static void findPairs(int[] arr, int triplet_sum) {
        int i = 0;
        int j = i + 1;
        int k = arr.length - 1;
        while (i < k && j < k) {
            if (arr[i] + arr[j] + arr[k] == triplet_sum) {
                System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                i++;
                j++;
                k--;
            } else if (arr[i] + arr[j] + arr[k] < triplet_sum) {
                i++;
                j++;
            } else if (arr[i] + arr[j] + arr[k] > triplet_sum) {
                k--;
            }
        }
    }
}
