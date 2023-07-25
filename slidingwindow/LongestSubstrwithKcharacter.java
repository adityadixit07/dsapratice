import java.util.HashSet;
import java.util.HashMap;

/**
 * LongestSubstrwithKcharacter
 */
public class LongestSubstrwithKcharacter {
    public static void main(String[] args) {
        String s="abcaabcdba";
        // int k=3; 
        // System.out.println(maxLengthwithUniqueChar(s));
        System.out.println(countChar(s));
    }
    // question?-> aisee substring find karni hai jise k chaacters honge aur vo sustring longest size ki hogi SO we have to return the size of that substring ABOVE OUTPUT LIKE:5 (aabca)
    public static int maxLengthwithUniqueChar(String s){
        int i=0;
        int j=0;
        int count=0;
        HashSet<Character> set=new HashSet<>();
        while(j<s.length()){
            if(set.contains(s.charAt(j))){
                while(set.contains(s.charAt(j))){
                    set.remove(s.charAt(i));
                    i++;
                }
                j++;
            }
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
            }
            
            if(set.size()==j-i+1){
                count=Math.max(count, set.size());
                j++;
            }
        }
        return count;
    }
    public static int countChar(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int right=0;
        int len=0;
        while(left<right){
            if(map.containsKey(s.charAt(right))){
                left=Math.max(left,map.get(s.charAt(right))+1);
            }
            map.put(s.charAt(right),right);
            len=Math.max(len,right-left+1);
            right++;
        }
        return len;
    }
}