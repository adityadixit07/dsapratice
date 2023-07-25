package BinarySearch;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class BinKclosestElement {
    public static void main(String[] args) {
        // int[] arr={10,20,30,40,50,60};
        int[] arr = { 0, 0, 0, 1, 3, 5, 6, 7, 8, 8 };
        int x = 2;
        int k = 2;
        System.out.println(findClosestElements(arr, x, k));
        System.out.println("second method");
        System.out.println(secondMethod(arr, x, k));
    }

    // https://leetcode.com/problems/find-k-closest-elements/
    public static List<Integer> findClosestElements(int[] arr, int x, int k) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (high + low) / 2;
            if (arr[mid] == x) {
                break;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        int l = mid - 1;
        int r = mid;
        List<Integer> res = new ArrayList<>();
        while (l >= 0 && r < arr.length && k > 0) {
            if (Math.abs(arr[l] - x) <= Math.abs(arr[r] - x)) {
                res.add(arr[l]);
                l--;
            } else {
                res.add(arr[r]);
                r++;
            }
            k--;
        }
        while (k > 0 && l >= 0) {
            res.add(arr[l]);
            l--;
            k--;
        }
        while (k > 0 && r < arr.length) {
            res.add(arr[r]);
            r++;
            k--;
        }
        Collections.sort(res);
        return res;
    }

    // second method
    public static List<Integer> secondMethod(int[] arr, int x, int k) {
        int low = 0;
        int high = arr.length - 1;
        while ((high - low) >= k) {
            if (Math.abs(arr[low] - x) > Math.abs(arr[high] - x)) {
                low++;
            } else {
                high--;
            }
        }
        List<Integer> res=new ArrayList<>();
        for(int i=low;i<=high;i++){
            res.add(arr[i]);
        }
        Collections.sort(res);
        return res;
    }
}
