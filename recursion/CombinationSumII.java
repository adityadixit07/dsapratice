package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public static void main(String[] args) {
        int[] arr={1,1,2,2};
        int target=4;
        System.out.println(printCombinationsSum(arr, target));

    }
    // find all unique combinations that sum to the target
    // rule -> each number of array is used once and the result does not contains any duplicate combination and the result will be in lexicographically sorted order
    public static List<List<Integer>> printCombinationsSum(int[] arr,int target){
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        combinations(arr,0,target,ans,new ArrayList<>());
        return ans;
    }
    public static void combinations(int[] arr,int index,int target,List<List<Integer>> ans,List<Integer> ds){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return ;
        }
        for(int i=index;i<arr.length;i++){
            //this check to avoid take duplicated in answer list
            if(i>index &&arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]>target){
                break;
            }
            ds.add(arr[i]);
            combinations(arr, i+1, target-arr[i], ans, ds);
            ds.remove(ds.size()-1);
        }
    }
}
