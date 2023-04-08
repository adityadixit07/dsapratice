package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetSumII {
    public static void main(String[] args) {
        int[] arr = { 1, 2 };
        System.out.println(uniqueSubsets(arr));
    }
    // question is similar to the subset sum I but here we have to print all
    // the unique subsets means answer does not contains any duplicate list

    public static List<List<Integer>> uniqueSubsets(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        helper(arr, 0, 0, ans, new ArrayList<>());
        return ans;
    }

    public static void helper(int[] arr, int index, int sum, List<List<Integer>> ans, List<Integer> ds) {
        ans.add(new ArrayList<>(ds));
        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i - 1]) {
                continue;
            } else {
                ds.add(arr[i]);
                helper(arr, i + 1, sum+arr[i], ans, ds);
                ds.remove(ds.size()-1);
            }
        }

    }
}
