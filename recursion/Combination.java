package recursion;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Combination {
    public static void main(String[] args) {
        int[] arr={2,3,6,7};
        int target=7;
        System.out.println(allCobinationsSum(arr, target));
    }
    // find all the combinations that array elements from target.
    //samne number can be choosen any times 
    public static List<List<Integer>> allCobinationsSum(int[] arr,int target){
        List<List<Integer>> ans=new ArrayList<>();
        combinations(arr, 0, target, ans, new ArrayList<>());
        return ans;
    }
    public static void combinations(int[] arr,int index,int target,List<List<Integer>>ans,List<Integer>ds){
        if(index==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        //picking  up or including it into the answer
        if(arr[index]<=target){
            ds.add(arr[index]);
            Collections.sort(ds );
            combinations(arr, index, target-arr[index], ans, ds);
            ds.remove(ds.size()-1);
        }
        //not pick up cases
        combinations(arr,index+1,target,ans,ds);

    }
}

