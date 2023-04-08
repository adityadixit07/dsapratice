package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Subsets {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        // print all subsets of the array {},{1},{2},{3},{1,2},{2,3},{1,3},{1,2,3}
        System.out.println(allsubsetes(arr));
    }

    public static List<List<Integer>> allsubsetes(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(arr);
        helper(arr, 0, ans, ds);
        //if we want that our whole list is in sorted order then we use this
        // Collections.sort(ans, (o1, o2) -> {
        //     int n = Math.min(o1.size(), o2.size());
        //     for (int i = 0; i < n; i++) {
        //         if (o1.get(i) == o2.get(i)) {
        //             continue;
        //         }
        //         else {
        //             // sort based on the unequal elements value
        //             return o1.get(i) - o2.get(i);
        //         }
        //     }
        //     // sort based on size
        //     return o1.size() - o2.size();
        // });
        return ans;
    }

    public static void helper(int[] arr, int index, List<List<Integer>> ans, List<Integer> ds) {
        ans.add(new ArrayList<>(ds));
        for (int i = index; i < arr.length; i++) {
            ds.add(arr[i]);
            helper(arr, i + 1, ans, ds);
            ds.remove(ds.size() - 1);
        }
    }

}
