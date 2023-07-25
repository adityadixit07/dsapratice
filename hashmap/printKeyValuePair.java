// package hashmap;
import java.util.HashMap;
import java.util.*;

public class printKeyValuePair {
    public static void main(String[] args) {
        int[] arr={20,2, 2, 3, 3, 4, 50, 50, 65, 65,65};
        // we have to print 1:1,2:2,3:1,4:1,5:1,6:2
        System.out.println(printpair(arr));
    }
    public static HashMap<Integer,Integer> printpair(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int old_freq=map.get(arr[i]);
                int new_freq=old_freq+1;
                map.put(arr[i], new_freq);
               
            }
            else{
                map.put(arr[i],1);
            }
        }
        // Set<Integer> keys=map.keySet();
        for(Integer key:map.keySet()){
            int val=map.get(key); //key ke corresponding value milegi
            System.out.println("Key:"+key+" value:"+val);
        }
        System.out.println("Size of hashmap:"+map.size());


        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int a=entry.getValue();
            System.out.println(a);
            // System.out.printf("Key:"+entry.getKey()+" Value:"+entry.getValue());
        }
        
        System.out.println("keys:");
        return map;

        // return map;
    }
}

// key ki value ke saath kisi doorsi key ki value ko compare karenge agar same
// aaye to count++ kardo nhi to chhod do 