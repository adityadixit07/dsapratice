// package hashmap;
import java.util.*;
import java.util.HashMap;
import java.util.Set;

class hashmapFunc{
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("india",145);
        map.put("china",300);
        map.put("Us", 23);
        map.put("nigeria",45);

        System.out.println(map);
        // for(Map.Entry<String, Integer> entry : map.entrySet()){
        //     System.out.printf("Key : %s and Value: %s %n",
        //         entry.getKey(), entry.getValue());
        // }
        // put functon do kam karega agar value pahle se padi hai to update karega 
        // nhi padi hai to insert kar dega hashmap me
        map.put("india", 150); //value updated against india
        System.out.println(map);
        
        Set<String> keys=map.keySet();
        // keySet() function return the all keys in hashmao
        System.out.println(keys); 
         
        for(String key:map.keySet()){
            int val=map.get(key);
            System.out.println(key+" "+val);
        }

        // all these function excute in o(1) time
    }
}