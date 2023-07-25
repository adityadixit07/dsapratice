// package hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueOccurence {
    public static void main(String[] args) {
        int[] arr={1,1,3,3,2,2,2,3,3};
        System.out.println(isUnique(arr));
    }
    public static boolean isUnique(int[] arr){
        int len=arr.length;
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<len;i++){
            if(map.containsKey(arr[i])){
            map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        
        // hashset
        HashSet<Integer> set=new HashSet<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(set.contains(entry.getValue())){
                return false;
            }
            else{
                set.add(entry.getValue());
            }
        }
        return true;
    }
}

// Input: arr = [1,2,2,1,1,3]
// Output: true
// Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.