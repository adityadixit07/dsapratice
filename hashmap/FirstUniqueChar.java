import java.util.HashMap;

public class FirstUniqueChar{
    public static void main(String[] args) {
        String s="abcsssbbbbaaa";
        //here c is non repeating character so we have to return its index
        System.out.println(firstNonRepeatingChar(s));
    }
    public static int firstNonRepeatingChar(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        //now checking for the first non repeating character in the string
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.get(c)==1){
                System.out.println("first non-repeating unique char:"+c);
                return i;
            }
        }
        return -1; //no non repeating unique character is found

    }
}