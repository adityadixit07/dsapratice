import java.util.HashMap;

public class Compute {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("key1", "dsa");
        map.put("key2", "java");
        map.put("key3", "python");
        map.put("key4", "Js");

        map.compute("key2",(key,val)->(val==null)?null:val.concat(" dsa course"));
        // agar key2 ke corresponding value null hogi to "dsa course"  add hoga
        // nahi to "java dsa course" print hoga 
        System.out.println(map);
    }
}
