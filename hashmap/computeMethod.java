import java.util.HashMap;
public class computeMethod {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        // adding values to the hashmap

        map.put("key1", 10);
        map.put("key2", 20);
        map.put("key3", 30);
        map.put("key4", 40);
        // printig detail of hashmap
        System.out.println(map);
        //computeIfAbsent(key,remappingFunction)

        // computeIfAbsent method ye karta hai ki agar koi key mapped wale se mil jate hai  to uski value ko update nhi karta ,agar key new hai to map me add kar dega
        System.out.println("compute if Absent method:");
        map.computeIfAbsent("key4", key->50); //this is not added in map because it is already present

        map.computeIfAbsent("key5", k->50);
        System.out.println(map);

        System.out.println("computeIfPresent method:");

        // computeIfPresent(key,bimapping function)
        map.computeIfPresent("key5",(key,val)->10); //key 5 ki value ko 10 kar dega
        map.computeIfPresent("key5",(key,val)->val+10); //key 5 ki value me 10 add ho jayega
        map.computeIfPresent("key8",(key,val)->val+10);

        System.out.println(map);
        // compute if present ye karta hai agar koi key present hai to usko update kar dega agar nahi hai to as it is rhega
    }
}
