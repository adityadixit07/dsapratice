import java.util.HashMap;
import java.util.*;
public class ContainsDuplicate {
    public static void main(String[] args) {
        // Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
        int[] nums={1,2,2,3,4,5};
        
        System.out.println(contains(nums));
    }
    public static boolean contains(int[] nums){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int old_freq=map.get(nums[i]);
                int new_freq=old_freq+1;
                map.put(nums[i],new_freq);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        
        // iterating the map
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int a=entry.getValue();
            if(a>1){
                return true;
            }
        }
        return false;
    }
}
