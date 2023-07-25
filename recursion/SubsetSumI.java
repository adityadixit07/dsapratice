package recursion;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SubsetSumI {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        System.out.println(allSubsetSums(arr));
    }

    // Given a list arr of N integers, print sums of all subsets in it.
    // time complexity:O(2^n+2^nlog(2^n))
    // space complexity: O(2^n)
    public static List<Integer> allSubsetSums(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        helper(arr, 0, 0, ans);
        Collections.sort(ans);
        return ans;

    }

    public static void helper(int[] arr, int index, int sum, List<Integer> ans) {
        if (index == arr.length) {
            ans.add(sum);
            return;
        }
        // picking up the answer
        helper(arr, index + 1, sum + arr[index], ans);
        // not picking up
        helper(arr, index + 1, sum, ans);
    }

    // power set approach brute force approach
    // public static ArrayList<Integer> subsetSums(ArrayList<Integer> arr) {
    // // code here
    // ArrayList<Integer> ans = new ArrayList<>();

    // int n = (int) Math.pow(2, arr.size() - 1);
    // for (int i = 0; i <= n; i++) {
    // int sum = 0;
    // for (int j = 0; j < arr.size(); i++) {
    // if ((i & (1 << j)) != 0) {
    // sum += arr.get(j);
    // }
    // }
    // ans.add(sum);
    // }
    // return ans;
    // }
}
